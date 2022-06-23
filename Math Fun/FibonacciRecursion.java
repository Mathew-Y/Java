import java.util.Scanner; // Import Scanner class

public class FibonacciRecursion
{ // Start of FibonacciRecursion class

    int fibonacci(int number)
    { // Start of fibonacci method
        if(number==0)
            return 0; // Return 0 back to caller
        else if(number==1)
            return 1; // Return 1 back to caller
        else
            return fibonacci(number-1) + fibonacci(number-2); // Return the result of fibonacci(number - 1) + fibonacci(number - 2), (recursive)
    } // End of fibonacci method
} // End of FibonacciRecursion class

class FibonacciRecursion_Tester
{ // Start of FibonacciRecursion_Tester class
    public static void main(String[] args)
    { // Start of main method
        FibonacciRecursion fib = new FibonacciRecursion(); // Creation of instance of class FibonacciRecursion called fib
        Scanner scanner = new Scanner(System.in); // Creation of instance of Scanner class
        String chosenAmount = ""; // String which will ask the user for the input
        int convertedAmount; // Integer which will be in charge of storing the integer value of user's input
        int i; // Integer which will be used for the counter

            while(true)
            { // Start of while loop
                System.out.print("Enter the first n amount of fibonacci numbers to output (Press e to exit): "); // Ask the user to enter a number or press e to exit
                chosenAmount = scanner.next(); // Store the user's input under chosenAmount variable

                if(chosenAmount.equals("e"))
                    System.exit(1); // Exit the program if they press e

                else
                { // Start of else block
                    try
                    { // Start of try block
                        convertedAmount = Integer.parseInt(chosenAmount); // Convert the string into an integer to use in the for loop
                    } // End of try block
                    catch (Exception e)
                    { // Start of catch block
                        System.out.println("Please enter a number or e to exit.\n"); // Tell user to either enter a number or press e to exit, nothing else
                        continue; // Continue back to the top of the loop
                    } // End of catch block

                    for(i = 0; i < (convertedAmount - 1); i++)
                        System.out.print(fib.fibonacci(i) + ", "); //Output the ith indice of fibonacci in a loop


                    System.out.println(fib.fibonacci(i) + "\n"); // Output the final fibonacci number the user asked for
                } // End of else block
            } // End of while loop
    } // End of main method
} // End of FibonacciRecursion_Tester class
