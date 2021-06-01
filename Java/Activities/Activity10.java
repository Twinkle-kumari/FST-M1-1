package Activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

		public static void main(String[] args) {

			Set<String> hs = new HashSet<String>();
			
			hs.add("Nikhil");
			hs.add("Ravi");
			hs.add("Mukund");
			hs.add("Priti");
			hs.add("Saahil");
			hs.add("Pravin");
			
			System.out.println("The hashset names are : "+hs);
			System.out.println("The Size of the List is "+hs.size());
			
			hs.remove("Pravin");
			
			
			
			if(hs.remove("Pravin"))
			{
				System.out.println("Pravin removed from the List");
			}
			
			else {
				System.out.println("Pravin is removed from List");
			}
			
			System.out.println("The hashset names are : "+hs);
			System.out.println("The Size of the List is : "+hs.size());
			System.out.println("Check if Nikhil contains in hashset names is :"+hs.contains("Nikhil"));
			System.out.println("The hashset names are : "+hs);
	}

}
