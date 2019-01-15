public class LabeledStat
{
	String label;
	String value;
	
	public LabeledStat(String inLabel, int inVal)
	{
		label = inLabel;
		value = String.valueOf(inVal);
	}
	
	public LabeledStat(String inLabel, long inVal)
	{
		label = inLabel;
		value = String.valueOf(inVal);
	}

	public LabeledStat(String inLabel, double inVal)
	{
		label = inLabel;
		value = Double.toString(inVal);
	}
	
	public String label()
	{
		return label;
	}
	
	public String value()
	{
		return value;
	}
}