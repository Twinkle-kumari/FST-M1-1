package Programs;

//----------------------------------Encapsulation----------------------------------------

class EncapsulationDemo {
    //Private members
    private int ssn;
    private String empName;
    private int empAge;

    //Public getter and setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}

public class EncapsTest{
    public static void main(String args[]) {
        //Object creation
        EncapsulationDemo obj = new EncapsulationDemo();
        
        //Set values
        obj.setEmpName("Nikhil");
        obj.setEmpAge(33);
        obj.setEmpSSN(32324567);

        //Get values
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
