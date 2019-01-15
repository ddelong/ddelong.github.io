public interface TaskAllocator
{
	public WorkUnit submitUnit(int userID, WorkUnit inUnit)
		throws InvalidUserException;
	
	public void rejectUnit(WorkUnit inUnit);
	
	public void acceptUnit(WorkUnit inUnit);
	
	public void acceptUnitNoAcc(WorkUnit inUnit);
	
	public int registerNew();
	
	public void unitTimeout(WorkUnit timedOutUnit);
}