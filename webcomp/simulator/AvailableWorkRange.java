public class AvailableWorkRange implements Comparable
{
	private int base;
	private int step;
	
	public AvailableWorkRange(int inBase, int inStep)
	{
		base = inBase;
		step = inStep;
	}
	
	public int getBase()
	{
		return base;
	}
	
	public int getStep()
	{
		return step;
	}
	
	public int compareTo(Object o) throws ClassCastException
	{
		AvailableWorkRange compRange = (AvailableWorkRange)(o);
		
		if(getBase() < compRange.getBase())
		{
			return -1;
		}
		else if(getBase() > compRange.getBase())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}