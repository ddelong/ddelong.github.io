import java.util.*;

public class ClientGenerator
{
	private int firstAvailID;
	private double workTime;
	private double addTime;
	private double malRate;
	private double misRate;
	private double quitRate;
	private int maxUsers;
	private WebCompSim mySim;
	private Tracker myTracker;
	private Random myRand;
	private StatManager myStats;
	private WebCompEventQueue eventQueue;
	
	public ClientGenerator(double inWork, double inAdd, double inMal,
		double inMis, double inQuit, int inMax, WebCompSim inSim, 
		Tracker inTrack, WebCompEventQueue inEQ)
	{
		firstAvailID = 0;
		workTime = inWork;
		addTime = inAdd;
		malRate = inMal;
		misRate = inMis;
		quitRate = inQuit;
		mySim = inSim;
		maxUsers = inMax;
		myTracker = inTrack;
		myRand = null;
		myStats = null;
		eventQueue = inEQ;
	}
	
	public ClientEvent genClient(double curTime) throws MaxUsersException
	{
		checkStats();
		if(myStats.activeUsers() >= maxUsers)
		{
			throw new MaxUsersException(curTime);
		}
		
		checkRandom();
		
		boolean good = !(myRand.nextDouble() < malRate);
		
		ClientEvent newClient = new ClientEvent(curTime, workTime, addTime,
			firstAvailID, -1, good, misRate, null, quitRate, eventQueue, myTracker);
		firstAvailID++;
		
		return newClient;
	}
	
	private void checkRandom()
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
}