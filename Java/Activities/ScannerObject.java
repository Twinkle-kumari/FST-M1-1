package Programs;

import java.util.Scanner;

class ScannerObject {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("Enter username");

        // Read user input
        String userName = scannerobj.nextLine();
        // Output user input
        System.out.println("Username is: " + userName);
    }
}