package Programs;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		String hello = "Hello World";
		System.out.println(hello);
		
	// For and For each Loop
		
		for (int i=0; i<=10; i++)
			System.out.println("Values of i : " +i);
		
		String names[] = {"Nikhil", "Ravi", "Mukund", "Pravin"};
		
		for(String name:names)
		{
			System.out.println(name);
		}
	}

}
