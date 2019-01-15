public class SimRunner
{
	public static void main(String args[])
	{
		String accountStyles[] = {"Rosenberg", "default"};
		double malRates[] = {0.1, 0.0, 0.25, 0.4};
		double misRates[] = {0.001};
		double checkRates[] = {0.02, 0.1, 0.01, 0.001};
		double workTimeBases[] = {8.0};
		double addTime[] = {4.0};
		double quitRates[] = {0.25, 0.5, 0.0, 0.1};
		int numCheckers[] = {1};
		double checkTimes[] = {0.00043471, 0.01, 0.001};
		int maxUsers[] = {10000};
		int initialUsers[] = {1000};
		double spawnRates[] = {0.1, 0.01, 0.5};
		int strikes[] = {1};
		int workUnits[] = {1000000};
		long randomSeeds[] = {0};
		double endTimes[] = {1000};
		String logName = "";
		
		WebCompSim theSim = null;
		
		for(int acc = 0; acc < accountStyles.length; acc++)
		{
			for(int check = 0; check < checkTimes.length; check++)
			{
				logName = "1." + (check+1) + "." + (acc+1);
				theSim = new WebCompSim(malRates[0], misRates[0],
					accountStyles[acc], checkRates[0], workTimeBases[0],
					addTime[0], quitRates[0], checkTimes[check]*workTimeBases[0],
					numCheckers[0], maxUsers[0], initialUsers[0],
					spawnRates[0], strikes[0], workUnits[0],
					randomSeeds[0], endTimes[0], logName);
				theSim.runSim();
				
				theSim = null;
			}
			
			for(int spawn = 0; spawn < spawnRates.length; spawn++)
			{
				logName = "2." + (spawn+1) + "." + (acc+1);
				theSim = new WebCompSim(malRates[0], misRates[0],
					accountStyles[acc], checkRates[0], workTimeBases[0],
					addTime[0], quitRates[0], checkTimes[0]*workTimeBases[0],
					numCheckers[0], maxUsers[0], initialUsers[0],
					spawnRates[spawn], strikes[0], workUnits[0],
					randomSeeds[0], endTimes[0], logName);
				theSim.runSim();
				
				theSim = null;
			}
			
			for(int quit = 0; quit < quitRates.length; quit++)
			{
				logName = "3." + (quit+1) + "." + (acc+1);
				theSim = new WebCompSim(malRates[0], misRates[0],
					accountStyles[acc], checkRates[0], workTimeBases[0],
					addTime[0], quitRates[quit], checkTimes[0]*workTimeBases[0],
					numCheckers[0], maxUsers[0], initialUsers[0],
					spawnRates[0], strikes[0], workUnits[0],
					randomSeeds[0], endTimes[0], logName);
				theSim.runSim();
				
				theSim = null;
			}
			
			for(int mal = 0; mal < malRates.length; mal++)
			{
				logName = "4." + (mal+1) + "." + (acc+1);
				theSim = new WebCompSim(malRates[mal], misRates[0],
					accountStyles[acc], checkRates[0], workTimeBases[0],
					addTime[0], quitRates[0], checkTimes[0]*workTimeBases[0],
					numCheckers[0], maxUsers[0], initialUsers[0],
					spawnRates[0], strikes[0], workUnits[0],
					randomSeeds[0], endTimes[0], logName);
				theSim.runSim();
				
				theSim = null;
			}
			
			for(int cRate = 0; cRate < checkRates.length; cRate++)
			{
				logName = "5." + (cRate+1) + "." + (acc+1);
				theSim = new WebCompSim(malRates[0], misRates[0],
					accountStyles[acc], checkRates[cRate], workTimeBases[0],
					addTime[0], quitRates[0], checkTimes[0]*workTimeBases[0],
					numCheckers[0], maxUsers[0], initialUsers[0],
					spawnRates[0], strikes[0], workUnits[0],
					randomSeeds[0], endTimes[0], logName);
				theSim.runSim();
				
				theSim = null;
			}
		}
	}
}