public class StatManager
{
	private int falseAccepts;
	private int goodAccepts;
	private int timeouts;
	private int rejects;
	private int activeUsers;
	private long accountingTime;
	private int checkedUnits;
	private int checkQueue;
	private int timeoutQueue;
	private WebCompSim theSim;
	
	public StatManager(WebCompSim inSim)
	{
		falseAccepts = 0;
		goodAccepts = 0;
		timeouts = 0;
		rejects = 0;
		activeUsers = 0;
		accountingTime = 0;
		checkedUnits = 0;
		checkQueue = 0;
		timeoutQueue = 0;
		theSim = inSim;
	}
	
	public void unitChecked()
	{
		checkedUnits++;
	}
	
	public void timeout()
	{
		timeouts++;
		activeUsers--;
	}
	
	public void newUser()
	{
		activeUsers++;
	}
	
	public void goodAccepted()
	{
		goodAccepts++;
	}
	
	public void falseAccepted()
	{
		falseAccepts++;
	}
	
	public void caughtNewBad()
	{
		rejects++;
	}
	
	public void caughtOldBad()
	{
		falseAccepts--;
		rejects++;
	}
	
	public void addAccountingTime(long l)
	{
		accountingTime = accountingTime + l;
	}
	
	public int activeUsers()
	{
		return activeUsers;
	}
	
	public void addCheck()
	{
		checkQueue++;
	}
	
	public void doneCheck()
	{
		checkQueue--;
		checkedUnits++;
	}
	
	public void timeoutAdded()
	{
		timeoutQueue++;
	}
	
	public void timeoutRemoved()
	{
		timeoutQueue--;
	}
	
	private int completions()
	{
		return falseAccepts + goodAccepts + rejects;
	}

	private double falsePositiveRatio()
	{
		if(completions() == 0)
		{
			return 0;
		}
		else
		{
			return (double)(falseAccepts) / (double)(completions());
		}
	}
	
	private int totalAcceptedUnits()
	{
		return (falseAccepts + goodAccepts);
	}
	
	private double averageUnitsPerHour()
	{
		if(theSim.currentTime() == 0)
		{
			return 0;
		}
		else
		{
			return (((double)(totalAcceptedUnits())) / theSim.currentTime());
		}
	}
	
	private double falsePosRatioNoRej()
	{
		if(totalAcceptedUnits() == 0)
		{
			return 0;
		}
		else
		{
			return (((double)(falseAccepts)) / ((double)(totalAcceptedUnits())));
		}
	}
	
	public LabeledStat[] getLabeledArray()
	{
		LabeledStat[] theStats = new LabeledStat[14];
		theStats[0] = new LabeledStat("Active Users", activeUsers);
		theStats[1] = new LabeledStat("Timeouts", timeouts);
		theStats[2] = new LabeledStat("Checked units", checkedUnits);
		theStats[3] = new LabeledStat("Accounting Time", accountingTime);
		theStats[4] = new LabeledStat("Rejects", rejects);
		theStats[5] = new LabeledStat("False Accepts", falseAccepts);
		theStats[6] = new LabeledStat("Good Accepts", goodAccepts);
		theStats[7] = new LabeledStat("Total Completions", completions());
		theStats[8] = new LabeledStat("Check Queue Size", checkQueue);
		theStats[9] = new LabeledStat("Timeout Queue Size", timeoutQueue);
		theStats[10] = new LabeledStat("False Positive Ratio", falsePositiveRatio());
		theStats[11] = new LabeledStat("Total Accepts", totalAcceptedUnits());
		theStats[12] = new LabeledStat("Units/Hour", averageUnitsPerHour());
		theStats[13] = new LabeledStat("False Pos. Ratio No Rej", falsePosRatioNoRej());
		
		return theStats;
	}
	
	public String getStatsString()
	{
		LabeledStat[] theStats = getLabeledArray();
		String str = new String();
		for(int x = 0; x < theStats.length; x++)
		{
			str = str + theStats[x].value() + "\t";
		}
		str.trim();
		
		return str;
	}
}