package Programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {
	
	// --------------ArrayList and LinkedList Declaration -----------
	
	List<String> arrlist = new ArrayList<String>();
	List<String> linkedlist = new LinkedList<String>();
	
	public void Collections() {
		
		// -------------Adding values to ArrayList and LinkList----------------------------
		
		arrlist.add("One");
		arrlist.add("Two");

		linkedlist.add("one");
		linkedlist.add("two");
		
		
		// -----------------Removing values from ArrayList and LinkList------------
		
		//arrlist.remove(0);
		//linkedlist.remove(1);
		
		//----------------getting values from ArrayList and LinkList-------------------------
		
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.get(1));
		System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.get(1));
		
		
		// Clear ALL elements form a ArrayList and LinkList ---------------------
		arrlist.clear();
		linkedlist.clear();
		
		
	}
	
	public static void main (String[] args)
	{
		Collections obj = new Collections();
		
		obj.Collections();
	}

	
	

}
