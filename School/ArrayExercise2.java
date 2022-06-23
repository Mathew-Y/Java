public class ArrayExercise2
{ // Start of arrayExercise2 class

    public static void main(String[] args)
    { // Start of main method
        int[] valA = {13, -22, 82, 17}; // Creation of int array called valA, stores the shown values
        int[] valB = {0, 0, 0, 0}; // Creation of int array called valB, will be used to store the difference between 25 and the values in valA

                for(int i = 0; i <= 3; i++)
                { // Start of for loop, counts 4 times
                    valB[i] = 25 - valA[i]; // Store the difference between 25 and valA[i] under valB[i]
                    System.out.println(valA[i] + " + " + valB[i] + " = " + 25); // Output the equations and answers to the user
                } // End of for loop

    } // End of main method
} // End of arrayExercise2 class
