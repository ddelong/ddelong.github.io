import java.util.*;

public class WebCompEventQueue
{
	private SortedSet mySet;
	
	public WebCompEventQueue()
	{
		mySet = new TreeSet(new EventComparator());
	}
	
	public void addEvent(WebCompEvent inEvent)
	{
		eqPrint("Event added: " + inEvent.toString());
		
		mySet.add(inEvent);
	}
	
	public WebCompEvent getNextEvent() throws NoSuchElementException
	{
		WebCompEvent nextEvent = (WebCompEvent)(mySet.first());
		mySet.remove(nextEvent);
		
		eqPrint("Event removed: " + nextEvent.toString());
		
		return nextEvent;
	}
	
	public int size()
	{
		return mySet.size();
	}
	
	public boolean isEmpty()
	{
		return mySet.isEmpty();
	}
	
	private void eqPrint(String str)
	{
		//System.out.println("WebCompEventQueue: " + str);
	}
	
	public Iterator iterator()
	{
		return mySet.iterator();
	}
}