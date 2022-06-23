/*
Mathew Younan
February 23 2021
This program will ask the user for a phrase, convert it into a character array, and reverse that array and put the reversed version in a new array.
The program will then output both versions to the user
 */
import java.util.Scanner; // Import the Scanner class
public class ReverseString
{ // Beginning of reverseString class

    public static void main(String[] args)
    { // Beginning of main method

        Scanner scanner = new Scanner(System.in); // Creates an instance of the Scanner class called scanner
        String input = ""; // String which will be responsible for taking the user's phrase as input
        boolean less_than_ten = false; // Boolean which will allow us to determine if the String is 10 letters or less
        final int MAX_CHARACTERS = 10; // Constant which will store the maximum number of characters we will allow for the String (10)
        char[] forward_array = new char[MAX_CHARACTERS]; // Character array which will store the String in its original form
        char[] backward_array = new char[MAX_CHARACTERS]; // Character array which will store the string in reverse

                while(!less_than_ten)
                { // STart of while loop
                    System.out.print("Please enter a string of text with a maximum of 10 characters: "); // Ask the user for a String no longer than 10 characters
                    input = scanner.nextLine(); // Assign the user input into the String we created called input
                        if (input.length() > MAX_CHARACTERS) // Check if the user's input is greater than 10 characters
                            System.out.println("Make sure that your string has a maximum of 10 characters.\n"); // Inform the user of the max number of characters they may enter
                        else
                            less_than_ten = true; // Set boolean to true to break out of the loop
                } // End of while loop

            forward_array = input.toCharArray(); // Convert the String into a character array and assign it to the forward_array

                for (int i = 0; i < forward_array.length; i++) // Loop which iterates depending on the number of characters in the string
                    backward_array[i] = forward_array[(forward_array.length - i) - 1]; // Assigns each location in the backward array to be the backwards version of the forward array

            System.out.println("Original Text: " + input); // Output the original text the user entered
            System.out.println("Reversed Text: " + new String(backward_array)); // Cast the backward array to a String and output it to the user
    } // End of main method
} // End of reverseString class
