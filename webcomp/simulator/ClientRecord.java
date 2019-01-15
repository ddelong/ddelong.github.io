import java.util.*;

public class ClientRecord
{
	private static int maxStrikes = 100;
	private int strikes;
	private boolean timedOut;
	private Stack workRanges;
	private boolean workRangeReallocated;
	
	public ClientRecord()
	{
		strikes = 0;
		timedOut = false;
		workRanges = new Stack();
		workRangeReallocated = false;
	}
	
	public void addStrike()
	{
		strikes++;
	}
	
	public boolean isValid()
	{
		if(strikes >= maxStrikes)
		{
			return false;
		}
		
		if(timedOut)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void hasTimedOut()
	{
		timedOut = true;
	}
	
	public WorkRange getLatestRange() throws EmptyStackException
	{
		return (WorkRange)(workRanges.peek());
	}
	
	public WorkRange removeLatestRange() throws EmptyStackException
	{
		return (WorkRange)(workRanges.pop());
	}
	
	public void addRange(WorkRange wr)
	{
		workRanges.add(wr);
	}
	
	public void reallocateWorkRange()
	{
		workRangeReallocated = true;
	}
	
	public boolean rangeReallocated()
	{
		return workRangeReallocated;
	}
	
	public static void setMaxStrikes(int s)
	{
		maxStrikes = s;
	}
}