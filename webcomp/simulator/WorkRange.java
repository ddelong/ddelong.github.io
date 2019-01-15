public class WorkRange
{
	private int baseNumber;
	private int firstStep;
	private int lastStep;
	
	public WorkRange(int inBase, int inStep)
	{
		baseNumber = inBase;
		firstStep = inStep;
		lastStep = inStep;
	}
	
	public WorkRange(AvailableWorkRange inRange)
	{
		baseNumber = inRange.getBase();
		firstStep = inRange.getStep();
		lastStep = inRange.getStep();
	}
	
	public int getBase()
	{
		return baseNumber;
	}
	
	public int firstStep()
	{
		return firstStep;
	}
	
	public int lastStep()
	{
		return lastStep;
	}
	
	public void setLatestStep(int inStep)
	{
		lastStep = inStep;
	}
}