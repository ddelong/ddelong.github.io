import java.util.*;

public class RosenbergTaskAlloc implements TaskAllocator
{
	private WorkUnit[] workUnits;
	private ArrayList workers;
	private SortedSet availWorkRanges;
	private int nextClientID;
	private StatManager myStats;
	private Tracker myTrack;
	private CheckQueue myChecker;
	private Random myRandom;
	private int nextAvailRange;
	private TimeoutQueue myTimeout;
	private WebCompSim mySim;
	
	public RosenbergTaskAlloc(Tracker inTrack, int maxUsers,
		int numWorkUnits, WebCompSim inSim)
	{
		nextClientID = 0;
		myTrack = inTrack;
		mySim = inSim;
		
		// Create work ranges
		availWorkRanges = new TreeSet();
		for(int x = 1; x < maxUsers; x++)
		{
			availWorkRanges.add(new AvailableWorkRange(x, 0));
		}
		nextAvailRange = maxUsers;
		
		// Create work units
		workUnits = new WorkUnit[numWorkUnits];
		for(int x = 0; x < numWorkUnits; x++)
		{
			workUnits[x] = new WorkUnit(x);
		}
		
		workers = new ArrayList();
		myStats = null;
		myChecker = null;
		myRandom = null;
		myTimeout = null;
	}
	
	public WorkUnit submitUnit(int userID, WorkUnit inUnit)
		throws InvalidUserException
	{
		// Start tracking time
		long startTime = System.currentTimeMillis();
		
		// Ensure stat manager is linked
		checkStatMan();
		
		// Check for user entry, throw exception for invalid
		ClientRecord worker;
		try
		{
			worker = (ClientRecord)(workers.get(userID));
			
			if(!worker.isValid())
			{
				taPrint("Client(" + userID + ") is no longer valid.");
				
				myStats.addAccountingTime(System.currentTimeMillis() - startTime);
				
				throw new InvalidUserException(userID);
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			taPrint("Client(" + userID + ") has no entry.");
			
			myStats.addAccountingTime(System.currentTimeMillis() - startTime);
			
			throw new InvalidUserException(userID);
		}
		
		// Handle unit if one is being submitted
		if(inUnit != null)
		{
			checkChecker();
			checkTimeout();
			
			taPrint("Client(" + userID + ") submitted unit(" + inUnit.getID() + ")");
			inUnit.setWorked(true);
			
			taPrint("Work unit(" + inUnit.getID() + ") being submitted to checker.");
			myChecker.check(inUnit);
			taPrint("Work unit(" + inUnit.getID() + ") removed from timeout queue.");
			myTimeout.removeUnit(inUnit);
		}
		
		// Prep worker to determine next unit
		WorkRange currentRange;
		AvailableWorkRange nextRange;
		try
		{
			currentRange = worker.getLatestRange();
			taPrint("Client's(" + userID + ") workrange has base(" 
				+ currentRange.getBase() + ") with step ("
				+ currentRange.lastStep() + ")");
		}
		catch(EmptyStackException e)
		{
			currentRange = null;
			taPrint("Client(" + userID + ") has no current work range.");
		}
		
		nextRange = getNextRange();
		
		if(nextRange != null)
		{
			taPrint("Next available work range has base(" + nextRange.getBase()
				+ ") with step(" + nextRange.getStep() + ")");
		}
		
		int newBase;
		int newStep;
		
		if(currentRange == null)
		{
			if(nextRange == null)
			{
				return null;
			}
			
			removeNextRange();
			worker.addRange(new WorkRange(nextRange));
			newBase = nextRange.getBase();
			newStep = nextRange.getStep();
		}
		else
		{
			if(nextRange == null)
			{
				try
				{
					WorkUnit nullUnit = getWorkUnit(currentRange.getBase(), 
						currentRange.lastStep()+1);
				}
				catch(IndexOutOfBoundsException indexError)
				{
					return null;
				}
			}
			
			if(nextRange.getBase() < currentRange.getBase())
			{
				taPrint("New range has smaller base(" + nextRange.getBase() + ")");
				int currentStep = currentRange.lastStep();
				int currentBase = currentRange.getBase();
				currentStep++;
				removeNextRange();
				worker.addRange(new WorkRange(nextRange));
				try
				{
					WorkUnit testUnit = getWorkUnit(currentBase, currentStep);
					addRange(new AvailableWorkRange(currentBase, currentStep));
					taPrint("Work range base(" + currentBase
						+ ") added back to available work ranges with step("
						+ currentStep +")");
				}
				catch(IndexOutOfBoundsException e)
				{
					taPrint("Original work range base and step out of bounds");
				}
				newBase = nextRange.getBase();
				newStep = nextRange.getStep();
			}
			else
			{
				int currentBase = currentRange.getBase();
				int currentStep = currentRange.lastStep();
				currentStep++;
				try
				{
					WorkUnit testunit = getWorkUnit(currentBase, currentStep);
					currentRange.setLatestStep(currentStep);
					newBase = currentRange.getBase();
					newStep = currentRange.lastStep();
					taPrint("Continuing to use base(" + newBase + ")");
				}
				catch(IndexOutOfBoundsException e)
				{
					taPrint("Base(" + currentBase + ") exhausted, using new base");
					currentStep--;
					currentRange.setLatestStep(currentStep);
					removeNextRange();
					newBase = nextRange.getBase();
					newStep = nextRange.getStep();
				}
			}
		}
		
		taPrint("Client(" + userID + ") using base(" + newBase + ") and step("
			+ newStep + ")");
		WorkUnit returnUnit = getWorkUnit(newBase, newStep);
		taPrint("Client(" + userID + ") receiving unit("
			+ returnUnit.getID() + ")");
		returnUnit.setAllocationTime(mySim.currentTime());
		returnUnit.setWorker(userID);
		checkTimeout();
		myTimeout.addUnit(returnUnit);		
		
		// Submit time to stat manager
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
		
		// Get next unit
		return returnUnit;
	}
	
	public void rejectUnit(WorkUnit badUnit)
	{
		// Record time for stats
		long startTime = System.currentTimeMillis();
		
		// Check for stat manager
		checkStatMan();
		
		taPrint("Work unit(" + badUnit.getID() + ") being rejected");
		
		// Give worker strike
		int workerID = badUnit.getLastWorker();
		ClientRecord badWorker = (ClientRecord)(workers.get(workerID));
		
		if(badUnit.wasAccepted())
		{
			// If previously accepted, mark caught and notify stat manager
			taPrint("Work unit(" + badUnit.getID() + ") was caught after previously being "
				+ "accepted");
			badWorker.addStrike();
			myStats.caughtOldBad();
			badUnit.acceptUnit(false);
			badUnit.caughtAsBad(true);
			checkPastUnits(badWorker);
		}
		else if(!badUnit.wasCaught())
		{
			// If newly caught as bad, inform stat manager
			taPrint("Work unit(" + badUnit.getID() + ") was newly caught");
			badWorker.addStrike();
			myStats.caughtNewBad();
			badUnit.caughtAsBad(true);
			checkPastUnits(badWorker);
		}
		
		taPrint("Client(" + workerID + ") made a mistake, checking past units.");
		
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
	}
	
	public void acceptUnit(WorkUnit goodUnit)
	{
		// Record time for stats
		long startTime = System.currentTimeMillis();
		
		acceptUnitNoAcc(goodUnit);
		
		// Submit accounting time
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
	}
	
	public void acceptUnitNoAcc(WorkUnit goodUnit)
	{
		// Check for stat manager
		checkStatMan();
		
		if(!goodUnit.isCorrect() && !goodUnit.wasAccepted())
		{
			taPrint("Work unit(" + goodUnit.getID()
				+ ") was accepted falsely.");
			myStats.falseAccepted();
		}
		else if(!goodUnit.wasAccepted())
		{
			taPrint("Work unit(" + goodUnit.getID()
				+ ") was accepted correctly.");
			myStats.goodAccepted();
		}
		
		goodUnit.acceptUnit(true);
	}
	
	public int registerNew()
	{
		// Start recording accounting time
		long startTime = System.currentTimeMillis();
		
		// Check for stat man
		checkStatMan();
		
		int newID = nextClientID;
		nextClientID++;
		workers.add(new ClientRecord());
		myStats.newUser();
		
		taPrint("UserID " + newID + " being allocated");
		
		// Submit accounting time
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
		
		return newID;
	}
	
	public void unitTimeout(WorkUnit timedOutUnit)
	{
		// Start recording time
		long startTime = System.currentTimeMillis();
		
		// Check for stat man
		checkStatMan();
		
		taPrint("Work unit(" + timedOutUnit.getID() + ") marked timed out.");
		
		// Mark user timed out
		int workerID = timedOutUnit.getLastWorker();
		taPrint("Client(" + workerID + ") timed out");
		ClientRecord timeOutUser = (ClientRecord)(workers.get(workerID));
		timeOutUser.hasTimedOut();
		try
		{
			WorkRange currentRange = timeOutUser.getLatestRange();
			
			// Remove unit from user's done list
			if(currentRange.firstStep() == currentRange.lastStep())
			{
				timeOutUser.removeLatestRange();
			}
			else
			{
				int currentStep = currentRange.lastStep();
				currentStep--;
				currentRange.setLatestStep(currentStep);
			}
			
			// Make base available
			int unitID = timedOutUnit.getID();
			int unitBase = getBase(unitID);
			int unitStep = getStep(unitID);
			try
			{
				WorkUnit theTest = getWorkUnit(unitID);			
				addRange(new AvailableWorkRange(unitBase, unitStep));
				taPrint("Adding base(" + unitBase + ") with step(" + unitStep
					+ ") to available work ranges");
			}
			catch(IndexOutOfBoundsException e)
			{
				taPrint("User's range (base(" + unitBase + ") step("
					+ unitStep + ")) out of range");
			}
			
			checkLastUnit(timeOutUser);
		}
		catch(EmptyStackException e)
		{
			taPrint("User unexpectedly had no range to remove");
		}
		
		// Notify statmanager of timeout
		myStats.timeout();
		
		// Submit accounting time
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
	}
	
	private void checkStatMan()
	{
		if(myStats == null)
		{
			myStats = myTrack.getStats();
		}
	}
	
	private WorkUnit getWorkUnit(int inBase, int inStep)
	{
		int workUnitID = ((2 * inBase) - 1) * myPower(inStep);
		return getWorkUnit(workUnitID);
	}
	
	private WorkUnit getWorkUnit(int workUnitID)
	{
		return workUnits[workUnitID - 1];
	}
	
	private static int getBase(int inUnitID)
	{
		return getBaseHelp(inUnitID + 1);
	}
	
	private static int getBaseHelp(int inUnitID)
	{
		if(inUnitID % 2 == 0)
		{
			return getBaseHelp(inUnitID / 2);
		}
		else
		{
			return ((inUnitID + 1)/2);
		}
	}
	
	private static int getStep(int inUnitID)
	{
		return getStepHelp(inUnitID + 1);
	}
	
	private static int getStepHelp(int inUnitID)
	{
		if(inUnitID % 2 == 0)
		{
			return (getStepHelp(inUnitID / 2) + 1);
		}
		else
		{
			return 0;
		}
	}
	
	private void checkPastUnits(ClientRecord theBadWorker)
	{
		checkChecker();
		boolean noEmptyException = true;
		WorkRange currentRange = null;
		int curBase;
		int curStep;
		
		try
		{
			currentRange = theBadWorker.getLatestRange();
			curBase = currentRange.getBase();
			curStep = currentRange.lastStep();
			
			if(currentRange.firstStep() == currentRange.lastStep())
			{
				theBadWorker.removeLatestRange();
			}
			else
			{
				int currentStep = currentRange.lastStep();
				currentStep--;
				currentRange.setLatestStep(currentStep);
			}
		}
		catch(EmptyStackException e)
		{
			curBase = -1;
			curStep = -1;
		}
		
		while(noEmptyException)
		{
			try
			{
				currentRange = theBadWorker.getLatestRange();
				myChecker.forceCheck(getWorkUnit(currentRange.getBase(), currentRange.lastStep()));
				
				if(currentRange.firstStep() == currentRange.lastStep())
				{
					theBadWorker.removeLatestRange();
				}
				else
				{
					int currentStep = currentRange.lastStep();
					currentRange.setLatestStep(currentStep-1);
				}
			}
			catch(EmptyStackException e)
			{
				noEmptyException = false;
			}
		}
		
		if(curBase != -1)
		{
			theBadWorker.addRange(new WorkRange(curBase, curStep));
		}
	}
	
	private void checkLastUnit(ClientRecord user)
	{
		checkChecker();
		
		WorkRange currentRange = null;
		int curBase;
		int curStep;
		
		try
		{
			currentRange = user.getLatestRange();
			curBase = currentRange.getBase();
			curStep = currentRange.lastStep();
		}
		catch(EmptyStackException e)
		{
			curBase = -1;
			curStep = -1;
		}
		
		if(curBase != -1)
		{
			myChecker.forceCheck(getWorkUnit(curBase, curStep));
		}
	}
	
	private void checkChecker()
	{
		if(myChecker == null)
		{
			myChecker = myTrack.getCheck();
		}
	}
	
	private void checkTimeout()
	{
		if(myTimeout == null)
		{
			myTimeout = myTrack.getTimeout();
		}
	}
	
	private int myPower(int degree)
	{
		if(degree > 0)
		{
			return(2 * myPower(degree - 1));
		}
		else
		{
			return 1;
		}
	}
	
	private AvailableWorkRange getNextRange()
	{
		AvailableWorkRange returnRange = null;
		
		try
		{
			returnRange = (AvailableWorkRange)(availWorkRanges.first());
		}
		catch(NoSuchElementException e)
		{
			try
			{
				WorkUnit testUnit = getWorkUnit(nextAvailRange, 0);
				returnRange = new AvailableWorkRange(nextAvailRange, 0);
				availWorkRanges.add(returnRange);
				nextAvailRange++;
			}
			catch(IndexOutOfBoundsException except)
			{
				taPrint("No more ranges to allocate.");
			}
		}		
		
		return returnRange;
	}
	
	private AvailableWorkRange removeNextRange()
	{
		AvailableWorkRange theRange = getNextRange();
		availWorkRanges.remove(theRange);
		taPrint("Range with base(" + theRange.getBase() + ") and step("
			+ theRange.getStep() + ") being removed");
		return theRange;
	}
	
	private void addRange(AvailableWorkRange inRange)
	{
		try
		{
			WorkUnit blah = getWorkUnit(inRange.getBase(), inRange.getStep());
			availWorkRanges.add(inRange);
		}
		catch(IndexOutOfBoundsException e)
		{
			taPrint("Range (base(" + inRange.getBase() + ") step("
				+ inRange.getStep() + ")) was not added to available ranges "
				+ "because it was out of range.");
		}
	}
	
	private void taPrint(String str)
	{
		//System.out.println("RosenbergTaskAlloc: " + str);
	}
}