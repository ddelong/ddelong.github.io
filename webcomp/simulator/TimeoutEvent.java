public class TimeoutEvent implements WebCompEvent
{
	private Tracker myTracker;
	private WebCompEventQueue eventQueue;
	private TimeoutQueue myQueue;
	private double currentTime;
	private double timeoutCheckFreq;
	private static final int TIEBREAKER = -2;
	
	public TimeoutEvent(double inCurTime, double inFreq, WebCompEventQueue inEQ,
		TimeoutQueue inQueue, Tracker inTrack)
	{
		currentTime = inCurTime;
		timeoutCheckFreq = inFreq;
		eventQueue = inEQ;
		myTracker = inTrack;
		myQueue = inQueue;
	}
	
	public void doEvent()
	{
		tePrint("Event started.");
		
		myQueue.checkUnits();
		
		double newTime = currentTime + timeoutCheckFreq;
		TimeoutEvent newEvent = new TimeoutEvent(newTime, timeoutCheckFreq,
			eventQueue, myQueue, myTracker);
		eventQueue.addEvent(newEvent);
		
		tePrint("Event finished.");
	}
	
	private void tePrint(String str)
	{
		//System.out.println("TimeoutEvent: " + str);
	}
	
	public double getTime()
	{
		return currentTime;
	}
	
	public void setTime(double newTime)
	{
		currentTime = newTime;
	}
	
	public int getTiebreaker()
	{
		return TIEBREAKER;
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
		return ("TimeoutEvent " + currentTime + " " + TIEBREAKER);
	}
}