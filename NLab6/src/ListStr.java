import java.util.ArrayList;
import java.util.ListIterator;

public class ListStr 
{
	public static void main(String[] args) 
	{
		ArrayList<String> listString=new ArrayList<String>();
		listString.add("one");
		listString.add("two");
		listString.add("three");
		listString.add("four");

		System.out.println(listString);
		
		listString.set(1, "zero");
		System.out.println(listString);
		
		ListIterator<String>itr=listString.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
