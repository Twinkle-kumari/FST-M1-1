package Activities;

 class CustomException{

	 String names;
	
		public void ExpectionTest() throws Exception{
		try {
			if (this.names!= null)
			{
			System.out.println("The content of String is :" +names);
			}
			else {
				throw new Exception();
			}
		}
			catch(Exception exp)
		
				{
					
						System.out.println("Empty String : "+exp.getMessage());
				}					
				
		}	
		
	}
	

public class Activity8 extends CustomException {

	
	
	public static void main(String[] args) throws Exception {
		CustomException obj = new CustomException();
		obj.names= null;
		obj.ExpectionTest();

	}

}
