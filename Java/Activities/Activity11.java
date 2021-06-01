package Activities;

import java.util.HashMap;
import java.util.Map;



public class Activity11 {

		public static void main(String[] args) {
			
			Map<Integer, String> colour = new HashMap<>();
			
			colour.put(1, "Red");
			colour.put(2, "Yellow");
			colour.put(3, "Green");
			colour.put(4, "Blue");
			colour.put(5, "Pink");
			
			System.out.println("The Values in Maps are : "+colour.values());
			
			System.out.println("The size of Maps is : "+colour.size());
		
			colour.remove(5,"Pink");
			
			if(colour.containsValue("Green")) {
				System.out.println("The colour Green is present in Maps");
			}
			else {
				System.out.println("The colour Green is not present in Maps");
			}
				
				System.out.println("The updated size of Maps is : "+colour.size());

	}

}
