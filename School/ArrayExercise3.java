public class ArrayExercise3
{ // Start of arrayExercise3 class

    public static void main(String[] args)
    { // Start of main method
        int[] val = {0, 1, 2, 3}; // Creation of int array called val, stores the shown values
        int temp = 0; // Variable that will help us reverse the order of the array

            System.out.print("Original Array: "); // Output original array message

                for(int i = 0; i <= 3; i++)
                { // Start of for loop, counts 4 times
                    System.out.print(val[i] + ", "); // Outputs the value at index i of array val
                } // End of for loop

            System.out.println(); // Skips a line in the console

                for(int i = 0; i <= (val.length) / 2; i++)
                { // Start of for loop, counts only 2 times because we only need to run the for loop
                    // for the first 2 values of the array, the other 2 will be swapped already
                    temp = val[i]; // Set temp to val[i]
                    val[i] = val[3 - i]; // Set val[i] equal to val[3 - i] (Change value)
                    val[3 - i] = temp; // set the value of val[3 - i] equal to temp
                } // End of for loop

            System.out.print("Reversed Array: "); // Output reversed array message

                for(int i = 0; i <= 3; i++)
                { // Start of for loop, counts 4 times
                    System.out.print(val[i] + ", "); // Outputs the value at index i of the changed array val
                } // End of for loop

    } // End of main method
} // End of arrayExercise3
