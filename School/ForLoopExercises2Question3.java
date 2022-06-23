/* Mathew Younan
   Mr. Ceccato
   May 6, 2020
   This program will ask the user for 2 words and print the two words on one line separated by enough dots until the line has a total of 30 spaces
 */
import java.util.Scanner; // Importing Scanner class
public class ForLoopExercises2Question3 { // Start of forLoopExercises2Question3 class

    public static void main(String[] args)
    { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        String word1 = null; // Variable that will store the user's first inputted word
        String word2 = null; // Variable that will store the user's second inputted word
        final int line_length = 30; // Constant that will store the desired length of the line outputted

        // These two variables will be used mostly for organizational purposes, even though it may increase the amount of lines in the program
        int word1_length = 0; // Variable that will store the length of the user's first word
        int word2_length = 0; // Variable that will store the length of the user's second word

            System.out.print("Please enter your first word: "); // Ask user for first word
            word1 = scan.next(); // Store first word under word1 variable
            System.out.print("Please enter your second word: "); // Ask user for second word
            word2 = scan.next(); // Store second word under word2 variable

            word1_length = word1.length(); // Store the length of the first word under word1_length variable
            word2_length = word2.length(); // Store the length of the second word under word2_length variable

            System.out.format("%s", word1); // Output the first word on the line

                for(int i = 1; i <= (line_length - (word1_length + word2_length)); i++) // Loop this amount of times: 30 subtract the length of both words added together
                    System.out.print("."); // Output a dot for every loop

            System.out.format("%s", word2); // Output word2 on the same line after the loop is finished
    } // End of main method
} // End of forLoopExercises2Question3 class
