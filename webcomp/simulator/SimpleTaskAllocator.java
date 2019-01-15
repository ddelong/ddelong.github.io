import java.util.*;

public class SimpleTaskAllocator implements TaskAllocator
{
	private WebCompList workUnits;
	private ArrayList workers;
	private int nextClientID;
	private StatManager myStats;
	private Tracker myTracker;
	private TimeoutQueue myTimeout;
	private WebCompSim mySim;
	private CheckQueue checker;
	
	public SimpleTaskAllocator(Tracker inTrack, int maxUsers, int numWorkUnits,
		WebCompSim inSim)
	{
		nextClientID = 0;
		myTracker = inTrack;
		myStats = null;
		workUnits = new WebCompList(numWorkUnits);
		workers = new ArrayList();
		myTimeout = null;
		checker = null;
		mySim = inSim;
		
		// Create work Units
		for(int x = 0; x < numWorkUnits; x++)
		{
			workUnits.addEnd(new WorkUnit(x));
		}
	}
	
	public WorkUnit submitUnit(int userID, WorkUnit inUnit) throws InvalidUserException
	{
		long startTime = System.currentTimeMillis();
		
		checkStats();
		
		if(nextClientID < userID)
		{
			taprint("Submitting user's ID exceeds highest ID know.");
			
			myStats.addAccountingTime(System.currentTimeMillis() - startTime);
			
			throw new InvalidUserException(userID);
		}
		else
		{
			ClientRecord worker = (ClientRecord)(workers.get(userID));
			WorkUnit returnUnit = null;
			
			if(!worker.isValid())
			{
				taprint("Connecting client(" + userID +")is no longer valid.");
				
				myStats.addAccountingTime(System.currentTimeMillis() - startTime);
				
				throw new InvalidUserException(userID);
			}
			
			if(inUnit != null)
			{
				taprint("Work unit(" + inUnit.getID() + ") received from client("
				 + userID + ")");
				checkTimeout();
				myTimeout.removeUnit(inUnit);
				taprint("Work unit(" + inUnit.getID() + ") removed from timeout queue.");
				checkChecker();
				checker.check(inUnit);
				taprint("Work unit(" + inUnit.getID() + ") given to checker.");
			}
			
			try
			{
				returnUnit = workUnits.removeFirst();
				taprint("Allocating client(" + userID + ") unit(" + returnUnit.getID() + ")");
				returnUnit.setWorker(userID);
				returnUnit.setAllocationTime(mySim.currentTime());
			}
			catch(NoSuchElementException e)
			{
				taprint("Ran out of work units to allocate");
			}
			
			if(returnUnit != null)
			{
				checkTimeout();
				myTimeout.addUnit(returnUnit);
				taprint("Work unit(" + returnUnit.getID() + ") given to timeout queue.");
			}
			
			myStats.addAccountingTime(System.currentTimeMillis() - startTime);
			
			return returnUnit;
		}
	}
	
	public void rejectUnit(WorkUnit badUnit)
	{
		long startTime = System.currentTimeMillis();
		
		checkStats();
		
		taprint("Work unit(" + badUnit.getID() + ") was submitted for rejection.");
		
		ClientRecord worker = null;
		int clientID = badUnit.getLastWorker();
		try
		{
			worker = (ClientRecord)(workers.get(clientID));
		}
		catch(IndexOutOfBoundsException e)
		{
			taprint("User unexpectedly not found in rejectUnit method.");
		}
		
		if(badUnit.wasAccepted())
		{
			// If previously accepted, mark caught and notify stat manager
			taprint("Work unit(" + badUnit.getID() + ") was previously accepted,"
				+ " and now discovered as bad.");
			worker.addStrike();
			myStats.caughtOldBad();
		}
		else if(!badUnit.wasCaught())
		{
			// If newly caught as bad, inform stat manager
			taprint("Work unit(" + badUnit.getID() + ") was caught as bad before accepted.");
			worker.addStrike();
			myStats.caughtNewBad();
		}
		badUnit.acceptUnit(false);
		badUnit.caughtAsBad(true);
		
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
	}
	
	public void acceptUnit(WorkUnit inUnit)
	{
		long startTime = System.currentTimeMillis();
		acceptUnitNoAcc(inUnit);
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
	}
	
	public void acceptUnitNoAcc(WorkUnit inUnit)
	{
		checkTimeout();
		checkStats();
		
		taprint("Work unit(" + inUnit.getID() + ") was accepted.");
		if(inUnit.isCorrect() && !inUnit.wasAccepted())
		{
			taprint("Work unit(" + inUnit.getID() + ") was good.");
			myStats.goodAccepted();
		}
		else if(!inUnit.wasAccepted())
		{
			taprint("Work unit(" + inUnit.getID() + ") was bad.");
			myStats.falseAccepted();
		}
		inUnit.acceptUnit(true);
		inUnit.caughtAsBad(false);
	}
	
	public int registerNew()
	{
		long startTime = System.currentTimeMillis();
		
		checkStats();
		int returnID = nextClientID;
		workers.add(new ClientRecord());
		nextClientID++;
		myStats.newUser();
		
		taprint("Connecting user given ID " + returnID);
		
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
		
		return returnID;
	}
	
	public void unitTimeout(WorkUnit inUnit)
	{
		long startTime = System.currentTimeMillis();
		
		taprint("Work unit(" + inUnit.getID() + ") has registered as timed out.");
		
		workUnits.addFront(inUnit);
		
		taprint("Work unit added back to queue.");
		
		int userID = inUnit.getLastWorker();
		ClientRecord timeUser = (ClientRecord)(workers.get(userID));
		timeUser.hasTimedOut();
		
		taprint("Client(" + userID + ") was marked as timed out.");
		
		myStats.timeout();
		
		myStats.addAccountingTime(System.currentTimeMillis() - startTime);
	}
	
	private void checkStats()
	{
		if(myStats == null)
		{
			myStats = myTracker.getStats();
		}
	}
	
	private void checkTimeout()
	{
		if(myTimeout == null)
		{
			myTimeout = myTracker.getTimeout();
		}
	}
	
	private void checkChecker()
	{
		if(checker == null)
		{
			checker = myTracker.getCheck();
		}
	}
	
	private void taprint(String str)
	{
		//System.out.println("SimpleTaskAllocator: " + str);
	}
}