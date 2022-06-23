class ArrayUtils
{ // Start of ArrayUtils class
    void reverse(int[] arr)
    { // Start of reverse method, takes in an int array
        int temp = 0; // Variable that will be used to help reverse a given array
            for(int i = 0; i <= (arr.length / 2); i++)
            { // Start of for loop, counts only 2 times because we only need to run the for loop
                temp = arr[i]; // Set temp to val[i]
                arr[i] = arr[3 - i]; // Set val[i] equal to val[3 - i] (Change value)
                arr[3 - i] = temp; // set the value of val[3 - i] equal to temp
            } // End of for loop
    } // End of reverse method

    void print(int[] arr)
    { // Start of print method, takes in an int array
        for(int i = 0; i <= arr.length - 1; i++)
        { // Start of for loop, counts 4 times
            System.out.print(arr[i] + ", "); // Outputs the value at index i of array val
        } // End of for loop
    } // End of print method

} // End of ArrayUtils class

public class ArrayUtils_Tester
{ // Start of ArrayUtils_Tester class

    public static void main(String[] args)
    { // Start of main method

        ArrayUtils a = new ArrayUtils(); // Creates a new instance of ArrayUtils called a
        int[] val = {0, 1, 2, 3}; // Creation of int array called val, stores the shown values

            System.out.format("%s", "Original Array: "); // Output the UI message of displaying the original array
            a.print(val); // Calls the print method in ArrayUtils, prints out the original version of val
            System.out.println(); // Skip a line in the console to organize data
            a.reverse(val); // Call the reverse method to reverse tha array val
            System.out.format("%s", "Reversed Array: "); // Output the UI message of displaying the reversed array
            a.print(val); // Calls the print method in ArrayUtils, prints out the reversed version of val

    } // End of main method
} // End of ArrayUtils_Tester class
