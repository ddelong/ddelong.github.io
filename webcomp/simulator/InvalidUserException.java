public class InvalidUserException extends Exception
{
	private int userID;
	
	public InvalidUserException(int inID)
	{
		userID = inID;
	}
	
	public int getID()
	{
		return userID;
	}
}