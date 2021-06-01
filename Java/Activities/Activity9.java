package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

		public static void main(String[] args) {
			List<String> arrlist = new ArrayList<String>();
		arrlist.add("Nikhil");
		arrlist.add("Ravi");
		arrlist.add("Mukund");
		arrlist.add(3,"Pravin");
		arrlist.add("Priti");
		
		for(String name:arrlist)
		{
			System.out.println("The Names in list are :" + name );
		}
			System.out.println("The 3rd name is List is " + arrlist.get(2));
			System.out.println("The size of the List is "+ arrlist.size());
			arrlist.remove(3);
			System.out.println("The New size of the List after removal is "+ arrlist.size());
		}

	}

