import java.util.*;

public class EventComparator implements Comparator
{
	private WebCompEvent e1;
	private WebCompEvent e2;
	
	public EventComparator()
	{
		e1 = null;
		e2 = null;
	}
	
	public int compare(Object o1, Object o2) throws ClassCastException
	{
		e1 = (WebCompEvent)(o1);
		e2 = (WebCompEvent)(o2);
		
		if(e1.getTime() < e2.getTime())
		{
			return -1;
		}
		else if(e1.getTime() > e2.getTime())
		{
			return 1;
		}
		else
		{
			if(e1.getTiebreaker() < e2.getTiebreaker())
			{
				return -1;
			}
			else if(e1.getTiebreaker() > e2.getTiebreaker())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
}