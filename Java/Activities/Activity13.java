package Activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


	class Activity13{
	public static void main(String[] args) {
		//Scanner function for inputing the values
		Scanner scan = new Scanner(System.in);
		//ArrayList to store the values
		List<Object> list = new ArrayList<>();
		//To Generate Random Integer values
		Random indexGen = new Random();
		
		System.out.print("Enter any integers number : ");
		
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		
		Integer nums[] = list.toArray(new Integer[0]);
		 int index = indexGen.nextInt(nums.length);
	    System.out.println("Index value generated: " +index);
        System.out.println("Value in arary at generated index: " + nums[0]);
		}
        	}
		
}
