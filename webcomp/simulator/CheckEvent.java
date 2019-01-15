public class CheckEvent implements WebCompEvent
{
	private CheckQueue myQueue;
	private double checkTime;
	private double currentTime;
	private WebCompEventQueue eventQueue;
	private static final int TIEBREAKER = -1;
	
	public CheckEvent(double inCurrentTime, double inCheckTime, CheckQueue inQueue,
		WebCompEventQueue inEQ)
	{
		currentTime = inCurrentTime;
		checkTime = inCheckTime;
		myQueue = inQueue;
		eventQueue = inEQ;
	}
	
	public void doEvent()
	{
		cePrint("Check event started at time " + currentTime);
		
		myQueue.checkNext();
		double newTime = currentTime + checkTime;
		cePrint("New event time is " + newTime);
		eventQueue.addEvent(new CheckEvent(newTime, checkTime, myQueue, eventQueue));
		
		cePrint("Check event finished.");
	}
	
	private void cePrint(String str)
	{
		//System.out.println("CheckEvent: " + str);
	}
	
	public double getTime()
	{
		return currentTime;
	}
	
	public int getTiebreaker()
	{
		return TIEBREAKER;
	}
	
	public void setTime(double newTime)
	{
		currentTime = newTime;
	}
	
	public boolean equals(Object o)
	{
		try
		{
			WebCompEvent compEvent = (WebCompEvent)(o);
			return((getTime() == compEvent.getTime()) && 
				(getTiebreaker() == compEvent.getTiebreaker()));
		}
		catch(ClassCastException e)
		{
			return false;
		}
	}
	
	public String toString()
	{
		return ("CheckEvent " + currentTime + " " + TIEBREAKER);
	}
}