package Programs;

//---------------------------Polymorphism - Method overloading----------------------------


class Overloading {
	
	// ------------------Data type of arguments-------------------------

  
		//Char data type
    public void disp(char c) {
        System.out.println("Character method is called");
		
    }

    //Integer data type
    
    public void disp(int a) {
       System.out.println("Integer method is called");
       
    }

 // --------------------------Sequence of Data type of arguments---------------------------      
       
    public void disp(char c, int num) {
        System.out.println("Character : First Argument -- Integer : Second Argument");
    }

    
    public void disp(int num, char c) {
        System.out.println("Integer : First Argument -- Character : Second Argument" );
    }
    
    // ------------------------------
    public static void main(String args[]) {
        //Object creation
    	Overloading obj = new Overloading();	
    	
       obj.disp(10);
       obj.disp('c');
       obj.disp('c',10);
       obj.disp(10, 'c');
}
}