package Activities;

// ----------------------------------Inheritance-------------------------------------------

//Parent Class
class Car {
		
  //Parent class Members (Variables)
	
  public String Model = "Fiesta";
   public String Colour = "Red";
   public String Transmission = "Automatic";
   public int Price = 1000000;



     
  //Parent class Methods
  void Specification() {
      System.out.println("The Model of Car is " +Model);
      System.out.println("The Colour of Car is " +Colour);
      System.out.println("The Transmission is " +Transmission);
      System.out.println("The Price is " +Price);
      
  }
}

//Child Class
public class Ford extends Car{
  //Child class member
   static String Make = "Ford Motors";
  
  static void spec() {
  System.out.println("The make of Car is " +Make);
  }
  
  
}



