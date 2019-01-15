import java.util.*;

public class ClientEvent implements WebCompEvent
{
	private double eventTime;
	private double workTime;
	private double additionalTime;
	private Random myRandom;
	private int internalID;
	private int servedID;
	private WebCompServer myServer;
	private boolean good;
	private double mistakeRate;
	private WorkUnit myUnit;
	private double quitRate;
	private Tracker myTracker;
	private WebCompEventQueue eventQueue;
	
	public ClientEvent(double inEventTime, double inWorkTime, double inAddTime,
		int inIntID, int inServID, boolean inGood, double inMisRate,
		WorkUnit inUnit, double inQuitRate, WebCompEventQueue inEQ, Tracker inTrack)
	{
		eventTime = inEventTime;
		workTime = inWorkTime;
		additionalTime = inAddTime;
		internalID = inIntID;
		servedID = inServID;
		good = inGood;
		mistakeRate = inMisRate;
		myUnit = inUnit;
		quitRate = inQuitRate;
		myTracker = inTrack;
		eventQueue = inEQ;
		myRandom = null;
		myServer = null;
	}
	
	public void doEvent()
	{
		clientPrint("Client(" + internalID + ") event started");
		
		myRandom = myTracker.getRandom();
		myServer = myTracker.getServ();
		
		if(servedID == -1)
		{
			servedID = myServer.registerNew();
			clientPrint("Client(" + internalID + ") got server ID: "
				+ servedID);
		}
		
		if(myUnit != null)
		{
			if(good)
			{
				if(myRandom.nextDouble() < mistakeRate)
				{
					myUnit.setCorrect(false);
					clientPrint("Client made a mistake doing unit(" + myUnit.getID()
						+ ")");
				}
				else
				{
					myUnit.setCorrect(true);
					clientPrint("Client correctly did unit(" + myUnit.getID() + ")");
				}
			}
			else
			{
				myUnit.setCorrect(false);
				clientPrint("Client maliciously incorrectly did unit(" + myUnit.getID()
					+ ")");
			}
		}
		else
		{
			clientPrint("Had no work unit to work on.");
		}
		
		try
		{
			if(myUnit != null)
			{
				clientPrint("Client connected as " + servedID
					+ " submitting unit(" + myUnit.getID() + ")");
			}
			myUnit = myServer.submitUnit(servedID, myUnit);
			if(myUnit != null)
			{
				clientPrint("Client connected as " + servedID
					+ " receiving unit(" + myUnit.getID() + ")");
			}
			else
			{
				quitRate = 1.0;
			}
		
			if(!(myRandom.nextDouble() < quitRate))
			{
				double newTime = eventTime + (myRandom.nextDouble() * additionalTime)
					+ workTime;
				
				ClientEvent nextEvent = new ClientEvent(newTime, workTime,
					additionalTime, internalID, servedID, good, mistakeRate,
					myUnit, quitRate, eventQueue, myTracker);
					
				eventQueue.addEvent(nextEvent);
			}
			else
			{
				clientPrint("Client is quitting on its own.");
			}
		}
		catch(InvalidUserException e)
		{
			clientPrint("Client stopped because no longer valid user.");
		}
		
		clientPrint("Event finished.");
	}
	
	private void clientPrint(String str)
	{
		//System.out.println("ClientEvent(" + internalID + "): " + str);
	}
	
	public double getTime()
	{
		return eventTime;
	}
	
	public void setTime(double newTime)
	{
		eventTime = newTime;
	}
	
	public int getTiebreaker()
	{
		return internalID;
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
		return ("ClientEvent " + eventTime + " " + internalID);
	}
}