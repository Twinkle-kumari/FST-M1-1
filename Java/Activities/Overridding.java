package Programs;


class Overriding_main {
    //Overridden method
    public void overriding() {
        System.out.println("This is parent Method");
    }
}
class Overridding extends Overriding_main {
    //Overriding method
    public void overriding() {
        System.out.println("Child Method overriding Parent method declared in Overriding_main class");
    }
    
    public static void main( String args[]) {
    	
  // ----Child class object initialization.
    	
        Overridding obj = new Overridding();
        
        //This will call the child class version of eat()
        obj.overriding();
    }
}



