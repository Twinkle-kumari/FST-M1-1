package Programs;

public class Exceptions {

	int a;
	int b;
	int div;
	
	public void Exceptions() {
		try {
	div = a/b;
	
	System.out.println("The division is :" +div);
	
		}
		
		catch(ArithmeticException exp)
		{
					
				System.out.println("Invalid Arthmetic expression : "  +exp.getMessage());
									
			
			}
		
		}
	

	public static void main(String[] args) {
		Exceptions obj = new Exceptions();
		
		
		obj.a = 10;
		obj.b = 0;
		obj.Exceptions();
		

	}

	
	
}
