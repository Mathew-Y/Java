import java.util.Scanner; // Importing Scanner class
public class DoWhileLoopRangeProgram { // Start of doWhileLoopRangeProgram class

    public static void main(String[] args) { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        int startRange = 0; // Variable that will store the user's inputted start of range
        int endRange = 0; // Variable that will store the user's inputted end of range
        int input = 0; // Variable that will store the user's integer input
        int inclusiveSum = 0; // Variable that will store the sum of the numbers in the range
        int exclusiveSum = 0; // Variable that will store the sum of the numbers outside the range

        System.out.print("Enter an integer for the start of the range: "); // Ask user for start of range
        startRange = scan.nextInt(); // Store start of range under startRange variable
        System.out.print("Enter an integer for the end of the range: "); // Ask user for end of range
        endRange = scan.nextInt(); // Store end of range under endRange variable
        System.out.println(""); // Put a space in console for organization of output

        do { // Do this at least once
            System.out.print("Enter an integer or zero (0) to end: "); // Ask user for an integer
            input = scan.nextInt(); // Store their integer under input variable

            if(input >= startRange && input <= endRange) { // Checks if their input is in the range, True branch
                inclusiveSum += input; // Add their input to the inclusiveSum variable
            } // End of true branch
            else { // Do this if their input is not in the range, True branch
                exclusiveSum += input; // Add their input to the exclusiveSum variable
            } // End of true branch

        } // End of do
        while(input != 0); // Check if user entered 0, don't repeat do branch if this is the case

        System.out.println(""); // Put a space in console for organization of output

        System.out.format("%s %d %n", "The sum of the integers inside the range is: ", inclusiveSum); // Output the inclusive sum
        System.out.format("%s %d", "The sum of the integers outside the range is: ", exclusiveSum); // Output the exclusive sum

    } // End of main method
} // End of doWhileLoopRangeProgram class
