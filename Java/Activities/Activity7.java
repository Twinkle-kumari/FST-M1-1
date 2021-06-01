package Activities;

interface Bicycleparts{
	
	int gears = 0;
	int currentspeed = 0;
}

interface Bicycleoperations{
	
	public void applybrake(int decrement);
	public void speedup(int increment);
	
}

 class Bicycle implements Bicycleparts, Bicycleoperations {
	 
	 int gears,currentspeed;
	
	 public Bicycle(int gears, int currentspeed) {
		 
		 this.currentspeed=currentspeed;
		 this.gears=gears;
		 		 
	 }

	
	public void applybrake(int decrement) {
		
		currentspeed -= decrement;
		System.out.println("The current speed "+currentspeed);
	}

	
	public void speedup(int increment) {
		
		currentspeed += increment;
		
		System.out.println("The current speed "+currentspeed);
	}
	
	public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentspeed);
    }
	 
}


 class MountainBike extends Bicycle {

	   
	    public int seatHeight;

	    
	    public MountainBike(int gears, int currentSpeed, int startHeight) {
	      
	        super(gears, currentSpeed);
	        seatHeight = startHeight;
	    }

	   
	    public void setHeight(int newValue) {
	        seatHeight = newValue;
	    }

	    public String bicycleDesc() {
	        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	    }  
	}


public class Activity7 {

		public static void main(String[] args) {
			MountainBike mb = new MountainBike(3, 0, 25);
	        System.out.println(mb.bicycleDesc());
	        mb.speedup(20);
	        mb.applybrake(5);
	}

}
