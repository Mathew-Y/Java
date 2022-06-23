/*
Mathew Younan
Mr. Ceccato
February 25, 2021
This program reverses a matrix, and outputs both the original and the reversed version
 */
class ReverseMatrix
{ // Start of reverseMatrix class

    // No need for a constructor because I am passing in a pre-made array

    int[][] reverseMatrix(int[][] forwards, int[][] backwards)
    { // Start of reverseMatrix method
            for (int i = 0; i < forwards.length; i++)
            { // Iterates through the number of rows
                    for (int j = 0; j < forwards[i].length; j++) // Iterates through the number of columns in a row
                        backwards[forwards.length - 1 - i][j] = forwards[i][(forwards[i].length - j) - 1]; // Sets the top right number in the matrix as the bottom left in the backwards matrix. Finishes loop when all numbers have been switched
            } // End of iteration through rows
        return backwards; // return backwards back to the program
    } // End of reverseMatrix method

    void displayMatrix(int[][] matrix)
    { // Start of displayMatrix method
            for (int i = 0; i < matrix.length; i++)
            { // Loops through the number of rows of matrix
                    for (int j = 0; j < matrix[i].length; j++) // Loops through the number of columns in row i
                        System.out.print(matrix[i][j] + " "); // Outputs the number at given location
                System.out.println(); // Create a space for formatting purposes
            } // End of iteration through rows
        System.out.println(); // Create a space for formatting purposes
    } // End of displayMatrix method

    int returnMaxRow(int[][] matrix)
    { // Start of returnMaxRow method
        int max = 0; // Integer which will be used to store the max length of a row in the matrix
                for (int i = 0; i < matrix.length; i++) // Iterate through all rows
                    max = Math.max(max, matrix[i].length); // Set max to the max row
            return max; // Return max back to the program
    } // End of returnMaxRow method
} // End of reverseMatrix class

public class ReverseMatrix_tester
{ // Beginning of reverseMatrix_tester class

    public static void main(String[] args)
    { // Beginning of main method
        int max = 0; // variable that will store the maximum length of
        ReverseMatrix reverse = null; // Create reverseMatrix object and make it null
        reverse = new ReverseMatrix();// Initialize the reverseMatrix object named reverse as a reverseMatrix object
        int[][] forward_array =
                { // Start of 2D array sample declaration
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {12, 13, 14, 15, 16}
                }; // End of 2D array sample declaration

            max = reverse.returnMaxRow(forward_array); // Assign max to the max row in the forward array using returnMaxRow method
            int[][] backwards_array = new int[forward_array.length][max]; // Initialize the backwards matrix with the space of the forward array
            backwards_array = reverse.reverseMatrix(forward_array, backwards_array); // Assign the backwards array to the reversed version of the forwards array

            System.out.println("Original Matrix"); // Original Matrix headline
            reverse.displayMatrix(forward_array); // Call displayMatrix method to print my forwards matrix

            System.out.println("\nReversed Matrix"); // Reversed Matrix headline
            reverse.displayMatrix(backwards_array); // Call displayMatrix method to print my backwards matrix
    } // End of main method
} // End of reverseMatrix_tester class
