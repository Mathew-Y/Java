import java.util.Scanner; // Import the Scanner class

class DigitNode
{ // Start of DigitNode class
    int digit = 0; // Variable which will store the data in the node
    DigitNode next = null; // Variable which will store the next node in the stack

    DigitNode(int digit)
    { // Start of DigitNode constructor
        this.digit = digit; // Assign the class variable data equal to the data in the user passes in
        next = null; // Set the next node equal to null
    } // End of DigitNode constructor
} // End of DigitNode class

class BinarytoDecimal
{ // Start of BinarytoDecimal class
    DigitNode head = null; // Variable which will store the head of the stack
    int size = 0; // Variable which will store the size of the stack

    void push(int digit)
    { // Start of push method
        DigitNode newNode = new DigitNode(digit); // Node which will store the new node being added to the stack
        newNode.next = head; // Setting the newNode's link equal to the head
        head = newNode; // Setting the head equal to the new node
        size++; // Increment size by 1
    } // End of push method

    int pop()
    { // Start of pop method
        int popped = head.digit; // Variable which will store the data from the node being popped
        head = head.next; // Set the head of the stack equal to the node after the head
        size--; // Decrement size by 1
        return popped; // Return the popped Node back to the main method
    } // End of pop method

    int binToDec(String binary)
    { // Start of binToDec method
        int total = 0; // Variable which will store the number in base 10
        int power_counter = 0; // Variable which will keep track of which number we are on and to which power we should raise 2

            for(int i = 0; i < binary.length(); i++)
            { // Start of for loop
                this.push(Integer.parseInt(String.valueOf(binary.charAt(i)))); // Push the binary number digits into the stack
            } // End of for loop

            while(head != null)
            { // Start of while loop
                if(head.digit == 1)
                    total += Math.pow(2, power_counter); // Raise 2 to the power of the power counter, add this number to the total

                this.pop(); // Pop head from stack
                power_counter++; // Increment the power counter by 1
            } // End of for loop
        return total; // Return the total to the main method
    } // End of binToDec method
} // End of BinarytoDecimal class

public class BinaryToDecimal_Tester
{ // Start of BinaryToDecimal_Tester class
    public static void main(String[] args)
    { // Start of main method
        BinarytoDecimal btd = new BinarytoDecimal(); // Create a new BinaryToDecimal instance
        Scanner scanner = new Scanner(System.in); // Create scanner for user input
        String input = ""; // String which will store the user's number in binary
        String response = ""; // String which will store the user's response regarding entering another number

            while(true)
            { // Start of while loop
                System.out.print("Please enter a number in base 2: "); // Ask the user to enter a binary number
                input = scanner.next(); // Assign the input variable to the input the user has entered

                int answer = btd.binToDec(input); // Set the answer variable equal to the calling of the binToDec method, passing in the user input
                System.out.println("\nYour number converted to base 10 is: " + answer); // Output the number in base 10

                System.out.print("\nWould you like to enter another number[Y/N]: "); // Ask the user if they would like to enter another number
                response = scanner.next(); // Save their response under the response variable

                    if(response.equalsIgnoreCase("y"))
                        continue; // Continue up to the top of the while loop
                    else
                        System.exit(1); // Close the program
            } // End of while loop
    } // End of main method
} // End of BinaryToDecimal_Tester class
