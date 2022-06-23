public class ArrayExercise1
{ // Start of arrayExercise1 class

    public static void main(String[] args)
    { // Start of main method
        int[] valA = {13, -22, 82, 17}; // Creation of int array called valA, stores the shown values
        int[] valB = {-12, 24, -79, -13}; // Creation of int array called valB, stores the shown values
        int[] sum = {0, 0, 0, 0}; // Creation of int array called sum, will store the sums of valA and valB

                for(int i = 0; i <= 3; i++)
                { // Start of for loop, counts 4 times
                    sum[i] = valA[i] + valB[i]; // Store the sum of valA[i] and valB[i] into sum[i]
                    System.out.println(valA[i] + " + " + valB[i] + " = " + sum[i]); // Output the equations and answers to the user
                } // End of for loop

    } // End of main method
} // End of arrayExercise1 class
