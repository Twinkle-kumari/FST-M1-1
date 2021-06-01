package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public Plane(int maxPassenger) {
    	 this.maxPassengers = maxPassenger;
    	 this.passengers = new ArrayList<>();
    	 
    }
    
    public void onboard(String passenger)
    {
  this.passengers.add(passenger);
    }
    
    public Date takeoff()
    {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    }
    
    public Date getLastTimeLanded() {
    return lastTimeLanded;
}
 public List<String> getPassesngers() {
	 return passengers;
 }    
 
    
}

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        
        Plane plane = new Plane(10);
        
        plane.onboard("Nikhil");
        plane.onboard("Ravi");
        plane.onboard("Mukund");
        plane.onboard("Kundu");
        plane.onboard("Pavin");
        plane.onboard("Aditya");
        plane.onboard("Priti");
        plane.onboard("Manish");
       
        System.out.println("Plane took off at: " + plane.takeoff());
        
        System.out.println("People on the plane: " + plane.getPassesngers());
       
        Thread.sleep(5000);
        
        plane.land();
       
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassesngers());
    }
}

