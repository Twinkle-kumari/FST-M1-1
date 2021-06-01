package Programs;

//-----------------------------------Interface-------------------------------------------------

interface Studenttemplate {
    public void Entryform();
    public void Onboarding();
}

class StudentInfo implements Studenttemplate {
    //This class has to implement both the abstract methods
    public void Entryform() {
        System.out.println("Please fill in all the details in Entry form");
    }
    public void Onboarding() {
        System.out.println("Based on your Entryform detials your onboarding is completed.");
    }
    public static void main(String arg[]) {
        StudentInfo obj = new StudentInfo();
        obj.Entryform();
        obj.Onboarding();
    }
}
