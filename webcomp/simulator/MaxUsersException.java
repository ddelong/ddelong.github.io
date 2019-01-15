public class MaxUsersException extends Exception
{
	public double time;
	
	public MaxUsersException(double inTime)
	{
		time = inTime;
	}
	
	public double getTime()
	{
		return time;
	}
}