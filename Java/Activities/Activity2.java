package Activities;

public class Activity2 {

	
	public static void main(String[] args) {

			int numbers[] = {10,77,10,54,-11,10};
			
			int findval = 10;
			int checkval = 30;
			int temp = 0;
			
			
			for(int number : numbers)
			{
				
			if(number==findval)
			{
				temp += findval;
				
			}
			
			if(temp>checkval)
			{
				break;
			}
			}
			
			System.out.println(temp);	
	}
}
