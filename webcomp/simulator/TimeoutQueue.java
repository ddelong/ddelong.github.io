import java.util.*;

public class TimeoutQueue
{
	private SortedSet outUnits;
	private double timeOutLength;
	private Tracker myTracker;
	private WebCompSim mySim;
	private TaskAllocator myTaskAlloc;
	private StatManager myStats;
	
	public TimeoutQueue(double inTimeout, WebCompSim inSim, Tracker inTrack)
	{
		outUnits = new TreeSet();
		timeOutLength = inTimeout;
		myTracker = inTrack;
		mySim = inSim;
		myStats = null;
	}
	
	public void addUnit(WorkUnit inUnit)
	{
		outUnits.add(inUnit);
		tqPrint("Work unit " + inUnit.getID() + " added to the timeout queue");
		checkStats();
		myStats.timeoutAdded();
	}
	
	public void removeUnit(WorkUnit removedUnit)
	{
		outUnits.remove(removedUnit);
		tqPrint("Work unit " + removedUnit.getID() + " was removed from timeout queue");
		checkStats();
		myStats.timeoutRemoved();
	}
	
	public void checkUnits()
	{
		Iterator myIter = outUnits.iterator();
		WorkUnit nowUnit;
		checkTaskAlloc();
		checkStats();
		
		tqPrint("Waiting work units being checked for timeout");
		
		while(myIter.hasNext())
		{
			nowUnit = (WorkUnit)(myIter.next());
			
			if(nowUnit.getAllocationTime() < (mySim.currentTime() - timeOutLength))
			{
				tqPrint("Work unit " + nowUnit.getID() + " was checked and found "
					+ "timed out");
				
				myTaskAlloc.unitTimeout(nowUnit);
				myIter.remove();
				myStats.timeoutRemoved();
			}
			else
			{
				tqPrint("Found non-timed out unit, rest are not timed out");
				break;
			}
		}
	}
	
	private void checkTaskAlloc()
	{
		if(myTaskAlloc == null)
		{
			myTaskAlloc = myTracker.getAlloc();
		}
	}
	
	private void checkStats()
	{
		if(myStats == null)
		{
			myStats = myTracker.getStats();
		}
	}
	
	private void tqPrint(String str)
	{
		//System.out.println("TimeoutQueue: " + str);
	}
}