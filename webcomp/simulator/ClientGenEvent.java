public class ClientGenEvent implements WebCompEvent
{
	private double currentTime;
	private double spawnRate;
	private ClientGenerator myClientGen;
	private WebCompEventQueue eventQueue;
	private Tracker myTracker;
	private static final int TIEBREAKER = -3;
	
	public ClientGenEvent(double inTime, double inSpawn, ClientGenerator inGen,
		WebCompEventQueue inEQ, Tracker inTrack)
	{
		currentTime = inTime;
		spawnRate = inSpawn;
		myClientGen = inGen;
		eventQueue = inEQ;
		myTracker = inTrack;
	}
	
	public void doEvent()
	{
		cgePrint("Event starting...");
		try
		{
			ClientEvent newClient = myClientGen.genClient(currentTime);
			eventQueue.addEvent(newClient);
			cgePrint("New client(" + newClient.getTiebreaker() + ") added.");
		}
		catch(MaxUsersException e)
		{
			cgePrint("Max users reached, no client added.");
		}
		
		double newTime = currentTime + spawnRate;
		ClientGenEvent newEvent = new ClientGenEvent(newTime, spawnRate, myClientGen,
			eventQueue, myTracker);
		eventQueue.addEvent(newEvent);
		cgePrint("Event finished.");
	}
	
	private void cgePrint(String str)
	{
		//System.out.println("ClientGenEvent: " + str);
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
		return ("ClientGenEvent " + currentTime + " " + TIEBREAKER);
	}
}