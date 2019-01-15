public class WebCompList
{
	private int first;
	private int last;
	private int size;
	private WorkUnit[] units;
	
	public WebCompList(int capacity)
	{
		units = new WorkUnit[capacity];
		size = 0;
		first = -1;
		last = -1;
	}
	
	public void addFront(WorkUnit inUnit)
	{
		if(size == 0)
		{
			first = 0;
			last = 0;
		}
		else
		{
			first--;
		}
		units[first] = inUnit;
		size++;
	}
	
	public void addEnd(WorkUnit inUnit)
	{
		if(size == 0)
		{
			first = 0;
			last = 0;
		}
		else
		{
			last++;
		}
		units[last] = inUnit;
		size++;
	}
	
	public WorkUnit removeFirst()
	{
		if(size == 0)
		{
			return null;
		}
		first++;
		size--;
		return units[first - 1];
	}
	
	public WorkUnit removeLast()
	{
		if(size == 0)
		{
			return null;
		}
		last--;
		size--;
		return units[last + 1];
	}
}