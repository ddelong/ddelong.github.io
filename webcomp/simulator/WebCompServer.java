public class WebCompServer
{
	private TaskAllocator myAlloc;
	private Tracker myTracker;
	
	public WebCompServer(Tracker inTrack)
	{
		myTracker = inTrack;
		myAlloc = null;
	}
	
	public WorkUnit submitUnit(int userID, WorkUnit inUnit)
		throws InvalidUserException
	{
		checkAlloc();
		
		return myAlloc.submitUnit(userID, inUnit);
	}
	
	public int registerNew()
	{
		checkAlloc();
		
		return myAlloc.registerNew();
	}
	
	private void checkAlloc()
	{
		if(myAlloc == null)
		{
			myAlloc = myTracker.getAlloc();
		}
	}
}