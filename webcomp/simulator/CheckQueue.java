import java.util.*;

public class CheckQueue
{
	private LinkedList workUnits;
	private TaskAllocator myTaskAlloc;
	private Tracker myTracker;
	private Random myRand;
	private double checkRate;
	private StatManager myStats;
	private double spotCheckTime;
	private WebCompSim theSim;
	
	public CheckQueue(double inCheckRate, double inCheckTime, WebCompSim inSim,
		Tracker inTrack)
	{
		checkRate = inCheckRate;
		myTracker = inTrack;
		workUnits = new LinkedList();
		myRand = null;
		myTaskAlloc = null;
		myStats = null;
		spotCheckTime = inCheckTime;
		theSim = inSim;
	}
	
	public void check(WorkUnit inUnit)
	{
		checkRand();
		
		cqPrint("Work unit(" + inUnit.getID() + ") " + "submitted for checking");
		
		double decision = myRand.nextDouble();
		
		if(decision < checkRate)
		{
			// Add unit to check queue
			cqPrint("Work unit(" + inUnit.getID() + ") will be checked");
			forceCheck(inUnit);
		}
		else
		{
			checkAlloc();
			
			// Just accept unit
			cqPrint("Work unit(" + inUnit.getID() + ") will not be checked, "
				+ "just accepted");
			myTaskAlloc.acceptUnitNoAcc(inUnit);
		}
	}
	
	public void forceCheck(WorkUnit inUnit)
	{
		checkStats();
		
		theSim.incrementTime(spotCheckTime);
		
		// Add unit to queue
		cqPrint("Work unit(" + inUnit.getID() + ") added to definite check queue");
		workUnits.add(inUnit);
		
		// Increment stats manager check waiting queue
		myStats.addCheck();
	}
	
	public void checkNext()
	{
		checkStats();
		checkAlloc();
		
		if(workUnits.size() != 0)
		{
			// get and check unit
			WorkUnit checkUnit = (WorkUnit)(workUnits.removeFirst());
			cqPrint("Work unit(" + checkUnit.getID() + ") being checked");
			if(checkUnit.isCorrect())
			{
				cqPrint("Unit(" + checkUnit.getID() + ") was correct");
				myTaskAlloc.acceptUnit(checkUnit);
			}
			else
			{
				cqPrint("Unit(" + checkUnit.getID() + ") was incorrect");
				myTaskAlloc.rejectUnit(checkUnit);
			}
			
			// Tell stats manager about completion
			myStats.doneCheck();
		}
	}
	
	private void checkAlloc()
	{
		if(myTaskAlloc == null)
		{
			myTaskAlloc = myTracker.getAlloc();
		}
	}
	
	private void checkRand()
	{
		if(myRand == null)
		{
			myRand = myTracker.getRandom();
		}
	}
	
	private void checkStats()
	{
		if(myStats == null)
		{
			myStats = myTracker.getStats();
		}
	}
	
	private void cqPrint(String str)
	{
		//System.out.println("CheckQueue: " + str);
	}
}