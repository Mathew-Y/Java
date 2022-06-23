import java.util.Scanner; // importing Scanner class

public class GrossPayCalculator { // Start of GrossPayCalculator class

    public static void main(String[] args) { // Main method

        Scanner scan = new Scanner(System.in); // Creation of Scanner named scan, used for everything except strings
        String fullName = null; // variable that will store the user's inputted full name
        int hoursWorked = 0; // variable that will store the user's inputted number of hours worked
        double payRate = 0.0; // variable that will store the user's inputted pay rate
        double grossPay = 0.0; // variable that will be used to store the calculation of the user's gross pay

        System.out.print("Please enter your full name: "); // Ask user for full name
        fullName = scan.nextLine(); // store input under full_name variable

        System.out.print("Enter the number of hours you work in 1 week: "); // Ask user for number of hours worked
        hoursWorked = scan.nextInt(); // Store input under hours_worked variable

        System.out.print("Enter your hourly pay rate: "); // Ask user for hourly pay rate
        payRate = scan.nextDouble(); // Store input under pay_rate variable

        grossPay = hoursWorked * payRate; // Calculation of user's gross pay by multiplying hours worked by pay rate

        //Proper Formatting
        System.out.format("%-22s %10s %10s %10s %n", "Name", "Hours", "Pay Rate", "Gross Pay"); // Output headings
        System.out.format("%-10s %10s %10s %10s %n", "----------------------", "-----", "--------", "---------"); // Output dashes
        System.out.format("%-22s %10d %10.2f %10.2f %n", fullName, hoursWorked, payRate, grossPay); // Output paycheck

    } // End of main method
} // End of GrossPayCalculator class
