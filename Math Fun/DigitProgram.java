
import java.util.Scanner; // Importing Scanner class
public class DigitProgram { // Start of DigitProgram class

    public static void main(String[] args) { // Main method
        Scanner scan = new Scanner(System.in); // Creation of scanner called scan
        int usersNumber = 0; // variable that will store the user's inputted 3 digit number
        final int hundredValue = 100; // constant that will hold the value of a hundred's place
        final int tenValue = 10; // constant that will hold the value of a ten's place
        int hundredsPlace = 0; // variable that will store the number of hundreds' places in the user's number
        int tensPlace = 0; // variable that will store the number of tens' places in the user's number

        System.out.print("Please enter a three-digit number: "); // Asks user for a 3 digit number
        usersNumber = scan.nextInt(); // Stores the int they enter under usersNumber variable

        hundredsPlace = usersNumber / hundredValue; // Calculates number of hundred places by dividing their number by a hundred's value
        usersNumber -= hundredsPlace * hundredValue; // Reassigns usersNumber to the remainder after subtracting the maximum amount of hundreds

        tensPlace = usersNumber / tenValue; // Calculates number of tens places by dividing the remainder by a ten's value
        usersNumber -= tensPlace * tenValue; // Reassigns usersNumber to the remainder after subtracting the maximum amount of tens

        System.out.println("The hundreds-place digit is: " + hundredsPlace); // Outputs the hundred's digit place
        System.out.println("The tens-place digit is: " + tensPlace); // Outputs the ten's digit place
        System.out.println("The ones-place digit is: " + usersNumber); // Outputs the one's digit place

    } // End of main method
} // End of DigitProgram class
