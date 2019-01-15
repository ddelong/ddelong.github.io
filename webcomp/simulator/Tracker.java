import java.util.*;

public class Tracker
{
	private TaskAllocator myAlloc;
	private StatManager myStats;
	private WebCompServer myServ;
	private CheckQueue myChecker;
	private WebCompEventQueue myEventQueue;
	private Random myRandom;
	private TimeoutQueue myTimeout;
	
	public Tracker()
	{
		myAlloc = null;
		myStats = null;
		myServ = null;
		myChecker = null;
		myEventQueue = null;
		myRandom = null;
		myTimeout = null;
	}
	
	public void setAlloc(TaskAllocator inAlloc)
	{
		myAlloc = inAlloc;
	}
	
	public void setStat(StatManager inStats)
	{
		myStats = inStats;
	}
	
	public void setServ(WebCompServer inServ)
	{
		myServ = inServ;
	}
	
	public void setCheck(CheckQueue inChecker)
	{
		myChecker = inChecker;
	}
	
	public void setEventQueue(WebCompEventQueue inQueue)
	{
		myEventQueue = inQueue;
	}
	
	public void setRandom(Random inRand)
	{
		myRandom = inRand;
	}
	
	public void setTimeout(TimeoutQueue inQueue)
	{
		myTimeout = inQueue;
	}
	
	public TaskAllocator getAlloc()
	{
		return myAlloc;
	}
	
	public StatManager getStats()
	{
		return myStats;
	}
	
	public WebCompServer getServ()
	{
		return myServ;
	}
	
	public CheckQueue getCheck()
	{
		return myChecker;
	}
	
	public WebCompEventQueue getEventQueue()
	{
		return myEventQueue;
	}
	
	public Random getRandom()
	{
		return myRandom;
	}
	
	public TimeoutQueue getTimeout()
	{
		return myTimeout;
	}
}