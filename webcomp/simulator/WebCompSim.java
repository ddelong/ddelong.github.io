import java.util.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.io.*;

public class WebCompSim
{
	private WebCompEventQueue eventQueue;
	private Tracker myTracker;
	private double currentTime;
	private String filename;
	private Random myRandom;
	private StatManager myStatMan;
	private TaskAllocator myAlloc;
	private WebCompServer myServer;
	private static final int ARGUMENTS = 16;
	private JLabel[] theLabels;
	private JLabel[] theValues;
	private double endTime;
	private FileWriter logFile;
	private JFrame myFrame;
	
	public WebCompSim(double inMalRate, double inMistakeRate, String inAccount,
		double inCheckRate, double inWorkTimeBase, double inMaxAdd, double inQuitRate,
		double inSpotCheckTime, int inCheckers, int inMaxUsers, int inInitialUsers,
		double inSpawn, int inStrikes, int inNumWorkUnits, long randomSeed,
		double inEndTime, String inName)
	{
		endTime = inEndTime;
		
		//Set ClientRecord strikes
		ClientRecord.setMaxStrikes(inStrikes);
		
		// Set up random object
		simPrint("Creating Random object with seed " + randomSeed + "...");
		myRandom = new Random(randomSeed);
		
		// Set current time to 0
		simPrint("Setting time to 0...");
		currentTime = 0;
		
		// Create Event Queue
		simPrint("Creating event queue...");
		eventQueue = new WebCompEventQueue();
		
		// Create Tracker
		simPrint("Creating tracker...");
		myTracker = new Tracker();
		myTracker.setRandom(myRandom);
		
		// Create log file
		simPrint("Creating log file...");
		if(inName == null)
		{
			Date today = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd-kk.mm.ss");
			filename = formatter.format(today);
			filename = filename + ".txt";
		}
		else
		{
			filename = inName + ".txt";
		}
		simPrint("Log created with name: " + filename);
		try
		{
			logFile = new FileWriter(filename, true);
		}
		catch(IOException e)
		{
			simPrint("Attempt to create log file failed.");
		}
		
		// Create StatManager
		simPrint("Creating statistics manager...");
		myStatMan = new StatManager(this);
		myTracker.setStat(myStatMan);
		
		// Create and add ClientGenEvent
		simPrint("Creating client generator...");
		ClientGenerator myClientGen = new ClientGenerator(inWorkTimeBase,
			inMaxAdd, inMalRate, inMistakeRate, inQuitRate, inMaxUsers, this,
			myTracker, eventQueue);
		simPrint("Creating client generator event...");
		ClientGenEvent myGenEvent = new ClientGenEvent(currentTime, inSpawn,
			myClientGen, eventQueue, myTracker);
		eventQueue.addEvent(myGenEvent);
		
		// Create and add CheckEvent and Queue
		if(!inAccount.equals("Rosenberg"))
		{
			inCheckRate = 1.0;
		}
		double spotCheckTime = inSpotCheckTime * inCheckers;
		simPrint("Creating check queue...");
		CheckQueue checkQueue = new CheckQueue(inCheckRate, spotCheckTime, this, myTracker);
		simPrint("Creating check event...");
		CheckEvent checkEvent = new CheckEvent(currentTime, spotCheckTime, 
			checkQueue, eventQueue);
		eventQueue.addEvent(checkEvent);
		
		// Create and add TimeoutEvent and Queue
		double timeoutTime = inWorkTimeBase + inMaxAdd + 0.1;
		simPrint("Creating timeout queue...");
		TimeoutQueue timeoutQueue = new TimeoutQueue(timeoutTime, this, myTracker);
		simPrint("Creating timeout event...");
		TimeoutEvent timeoutEvent = new TimeoutEvent(currentTime, 
			timeoutTime, eventQueue, timeoutQueue, myTracker);
		eventQueue.addEvent(timeoutEvent);
		
		// Create Task Allocator
		simPrint("Creating task allocator...");
		if(inAccount.equals("Rosenberg"))
		{
			simPrint("Rosenberg task allocator created.");
			myAlloc = new RosenbergTaskAlloc(myTracker, inMaxUsers, inNumWorkUnits,
				this);
		}
		else
		{
			simPrint("Simple task allocator created.");
			myAlloc = new SimpleTaskAllocator(myTracker, inMaxUsers, inNumWorkUnits,
				this);
		}
		
		// Create client events
		simPrint("Creating " + inInitialUsers + " client events...");
		for(int x = 0; x < inInitialUsers; x++)
		{
			try
			{
				ClientEvent newEvent = myClientGen.genClient(currentTime);
				eventQueue.addEvent(newEvent);
			}
			catch(MaxUsersException e)
			{
				simPrint("Had to stop adding clients, maximum exceeded.");
				break;
			}
		}
		
		// Create Server
		simPrint("Creating web computation server...");
		myServer = new WebCompServer(myTracker);
		
		// Create GUI (stat display)
		/* disabled for now
		simPrint("Creating GUI...");
		myFrame = new JFrame("Current Statistics");
		myFrame.setSize(300,400);
		LabeledStat[] theStats = myStatMan.getLabeledArray();
		
		theLabels = new JLabel[theStats.length];
		for(int x = 0; x < theStats.length; x++)
		{
			theLabels[x] = new JLabel(theStats[x].label(), JLabel.LEFT);
		}
		
		theValues = new JLabel[theStats.length];
		for(int x = 0; x < theStats.length; x++)
		{
			theValues[x] = new JLabel(theStats[x].value(), JLabel.RIGHT);
		}
		
		myFrame.getContentPane().setLayout(new GridLayout(theStats.length,2,1,1));
		
		for(int x = 0; x< theStats.length; x++)
		{
			myFrame.getContentPane().add(theLabels[x]);
			myFrame.getContentPane().add(theValues[x]);
		}
		
		myFrame.setVisible(true);
		
		simPrint("GUI successfully created.");
		*/
		
		// Set tracker links
		simPrint("Setting tracker links...");
		myTracker.setAlloc(myAlloc);
		myTracker.setServ(myServer);
		myTracker.setCheck(checkQueue);
		myTracker.setEventQueue(eventQueue);
		myTracker.setTimeout(timeoutQueue);
		
		// Write log info header
		try
		{
			logFile.write("# " + inAccount + " " + inMalRate + " " + inMistakeRate
				+ " " + inCheckRate + " " + inCheckers + " " + inWorkTimeBase + " "
				+ inMaxAdd + " " + inQuitRate + " " + inSpotCheckTime + " " + inMaxUsers
				+ " " + inInitialUsers  + " " + inSpawn + " " + inStrikes + " "
				+ inNumWorkUnits + " " + randomSeed + " " + inEndTime + "\n");
			String head2 = "#";
			LabeledStat[] headStat = myStatMan.getLabeledArray();
			for(int l = 0; l < headStat.length; l++)
			{
				head2 = head2 + headStat[l].label() + "\t";
			}
			head2 = head2 + "\n";
			logFile.write(head2);
		}
		catch(IOException e)
		{
			simPrint("Attempt to write log file header failed.");
		}
	}
	
	public void runSim()
	{
		long simStart = System.currentTimeMillis();
		double nextTime;
		currentTime = -1;
		
		while(!eventQueue.isEmpty() && (currentTime < endTime))
		{
			// Process next event
			WebCompEvent newEvent = eventQueue.getNextEvent();
			nextTime = newEvent.getTime();
			if(nextTime < currentTime)
			{
				//updateEventTimes();
			}
			else
			{
				currentTime = nextTime;
			}
			//simPrint("Time is now " + currentTime);
			newEvent.doEvent();
			//simPrint("There are " + eventQueue.size() + " events waiting.");
			
			// Write to log
			logWrite();
			
			// Update display (disabled)
			// updateDisplay();
		}
		
		long simDuration = (System.currentTimeMillis() - simStart) / 1000;
		simPrint("Simulation took ~" + simDuration + " seconds");
		// myFrame.setVisible(false);
		
		try
		{
			logFile.close();
		}
		catch(IOException e)
		{
			simPrint("IOException occurred while trying to close log.");
		}
	}
	
	public void incrementTime(double howLong)
	{
		//currentTime = currentTime + howLong;
	}
	
	private void updateEventTimes()
	{
		Iterator myIter = eventQueue.iterator();
		WebCompEvent nextEvent;
		
		simPrint("Starting event time updates");
		
		while(myIter.hasNext())
		{
			nextEvent = (WebCompEvent)myIter.next();
			
			if(nextEvent.getTime() < currentTime)
			{
				simPrint("Setting event time from " + nextEvent.getTime()
					+ " to " + currentTime);
				nextEvent.setTime(currentTime);
			}
			else
			{
				break;
			}
		}
		
		simPrint("Ending event time updates");
	}
	
	private void logWrite()
	{
		// Write current stats to file
		try
		{
			//simPrint("Updating log");
			logFile.write(currentTime + "\t" + myStatMan.getStatsString() + "\n");
			logFile.flush();
		}
		catch(IOException e)
		{
			simPrint("IOException occurred.");
		}
	}
	
	private void simPrint(String str)
	{
		System.out.println("WebCompSim: " + str);
	}
	
	private void updateDisplay()
	{
		// Display current stats on screen
		simPrint("Updating display");
		// Get fresh stats
		LabeledStat[] newStats = myStatMan.getLabeledArray();
		// Update labels
		for(int x = 0; x < theValues.length; x++)
		{
			theValues[x].setText(newStats[x].value());
		}
	}
	
	public double currentTime()
	{
		return currentTime;
	}
	
	private static void printUsage()
	{
		// Read usage.txt and print out
		try
		{
			BufferedReader myReader = new BufferedReader(new FileReader("usage.txt"));
			String currentLine = myReader.readLine();
			while(currentLine != null)
			{
				System.out.println(currentLine);
				currentLine = myReader.readLine();
			}
		}
		catch(IOException e)
		{
			System.out.println("Attempt to read and print usage failed.");
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Web Computation Simulation starting up...");
		// Check number of arguments
		if(args.length < ARGUMENTS)
		{
			printUsage();
			System.exit(0);
		}
		
		// Parse Arguments
		System.out.println("Parsing arguments...");
		String pAccount = args[0];
		double pMalRate = Double.parseDouble(args[1]);
		double pMisRate = Double.parseDouble(args[2]);
		double pCheckRate = Double.parseDouble(args[3]);
		double pWorkTime = Double.parseDouble(args[4]);
		double pAddTime = Double.parseDouble(args[5]);
		double pQuitRate = Double.parseDouble(args[6]);
		double pCheckTime = Double.parseDouble(args[7]);
		int pCheckers = Integer.parseInt(args[8]);
		int pMaxUsers = Integer.parseInt(args[9]);
		int pInitialUsers = Integer.parseInt(args[10]);
		double pSpawnRate = Double.parseDouble(args[11]);
		int pStrikes = Integer.parseInt(args[12]);
		int pWorkUnits = Integer.parseInt(args[13]);
		long pRandomSeed = Long.parseLong(args[14]);
		double pEndTime = Double.parseDouble(args[15]);
		System.out.println("Parsing complete.");
		
		// Create WebCompSim
		System.out.println("Creating WebCompSim object");
		WebCompSim mySim = new WebCompSim(pMalRate, pMisRate, pAccount,
			pCheckRate, pWorkTime, pAddTime, pQuitRate, pCheckTime, pCheckers,
			pMaxUsers, pInitialUsers, pSpawnRate, pStrikes, pWorkUnits,
			pRandomSeed, pEndTime, null);
		System.out.println("WebCompSim object created.");
		
		// Start sim
		System.out.println("Starting simulation...");
		mySim.runSim();
		System.out.println("Simulation finished.");
		System.exit(0);
	}
}