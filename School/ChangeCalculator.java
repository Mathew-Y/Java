
import java.util.Scanner;

public class ChangeCalculator { // Start of ChangeCalculator class

    public static void main(String[] args) { // Main method
        Scanner scan = new Scanner(System.in); // Creates Scanner called scan
        int change = 0; // Variable that will store user current change amount
        final int quarter = 25; // constant that will store value of quarter
        final int dime = 10; // constant that will store value of dime
        final int nickel = 5; // constant that will store value of nickel
        int quarterCount = 0; // variable that will store the number of quarters
        int dimeCount = 0; // variable that will store the number of dimes
        int nickelCount = 0; // variable that will store the number of nickels

        System.out.print("Please enter the amount of change in cents: "); // Asks user for the amount of change in cents
        change = scan.nextInt(); // Saves inputted change under variable change

        quarterCount = change / quarter; // Calculates number of quarters by dividing total change by quarter value
        change %= quarter; // Reassigns value of change to new remainder

        dimeCount = change / dime; // Calculates number of dimes by dividing remainder change by dime value
        change %= dime; // Reassigns value of change to new remainder

        nickelCount = change / nickel; // Calculates number of nickels by dividing remainder change by nickel value
        change %= nickel; // Reassigns value of change to new remainder

        System.out.println("The minimum number of coins is: "); // Output statement
        System.out.println("Quarters: " + quarterCount); // Displays number of quarters
        System.out.println("Dimes: " + dimeCount); // Displays number of dimes
        System.out.println("Nickels: " + nickelCount); // Displays number of nickels
        System.out.println("Pennies: " + change); // Displays remainder change (penny count)

    } // End of main method
} // End of ChangeCalculator class
