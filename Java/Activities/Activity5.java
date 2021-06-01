package Activities;

abstract class Books{

 static String title;

abstract void settitle(String newvalue);

public String gettitle()

{
	return title;
	}

}


public class Activity5 extends Books{
	
	
void settitle(String newvalue) {
		title = newvalue;
}
	
	 public static void main(String args[]) {
		 Activity5 obj = new Activity5();
		obj.title= "Java Books";
		obj.settitle(title);		     
        System.out.println("The Title of Book is : "+obj.gettitle());
	}


	
	}
	
