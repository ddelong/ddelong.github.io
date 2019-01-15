public class WorkUnit implements Comparable
{
	private int unitID;
	private int lastWorkerID;
	private boolean correct;
	private double allocationTime;
	private boolean accepted;
	private boolean caughtBad;
	private int allocations;
	private boolean worked;
	
	public WorkUnit(int assignedID)
	{
		unitID = assignedID;
		correct = true;
		accepted = false;
		caughtBad = false;
		lastWorkerID = -1;
		allocations = 0;
		worked = false;
	}
	
	public int getLastWorker()
	{
		return lastWorkerID;
	}
	
	public void setWorker(int newWorker)
	{
		lastWorkerID = newWorker;
	}
	
	public double getAllocationTime()
	{
		return allocationTime;
	}
	
	public void setAllocationTime(double allocTime)
	{
		allocationTime = allocTime;
	}
	
	public int getID()
	{
		return unitID;
	}
	
	public void setCorrect(boolean newBool)
	{
		correct = newBool;
	}
	
	public boolean isCorrect()
	{
		return correct;
	}
	
	public void acceptUnit(boolean inBool)
	{
		accepted = inBool;
	}
	
	public boolean wasAccepted()
	{
		return accepted;
	}
	
	public void caughtAsBad(boolean inBool)
	{
		caughtBad = inBool;
	}
	
	public boolean wasCaught()
	{
		return caughtBad;
	}
	
	public int numAllocations()
	{
		return allocations;
	}
	
	public void setAllocations(int inAllocs)
	{
		allocations = inAllocs;
	}
	
	public void setWorked(boolean inWork)
	{
		worked = inWork;
	}
	
	public boolean isWorked()
	{
		return worked;
	}
	
	public int compareTo(Object o) throws ClassCastException
	{
		WorkUnit compUnit = (WorkUnit)(o);
		
		if(getAllocationTime() < compUnit.getAllocationTime())
		{
			return -1;
		}
		else if(getAllocationTime() > compUnit.getAllocationTime())
		{
			return 1;
		}
		else
		{
			if(getID() < compUnit.getID())
			{
				return -1;
			}
			else if(getID() > compUnit.getID())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
}