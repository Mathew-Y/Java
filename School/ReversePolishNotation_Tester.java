import java.util.Scanner; // Import Scanner class

class StackNode
{ // Start of Node class
    double data = 0.0; // Variable which will store the data in the node
    StackNode next = null; // Variable which will store the next node in the stack

    StackNode(double data)
    { // Start of Node constructor
        this.data = data; // Assign the class variable data equal to the data in the user passes in
        next = null; // Set the next node equal to null
    } // End of Node constructor
} // End of Node class

class ReversePolishNotation
{ // Start of ReversePolishNotation class
    StackNode head = null; // Variable which will store the head of the stack
    int size = 0; // Variable which will store the size of the stack

    void push(double data)
    { // Start of push method
        StackNode newNode = new StackNode(data); // Node which will store the new node being added to the stack
        newNode.next = head; // Setting the newNode's link equal to the head
        head = newNode; // Setting the head equal to the new node
        size++; // Increment size by 1
    } // End of push method

    double pop()
    { // Start of pop method
        double popped = head.data; // Variable which will store the data from the node being popped
        head = head.next; // Set the head of the stack equal to the node after the head
        size--; // Decrement size by 1
        return popped; // Return the popped Node back to the main method
    } // End of pop method

    double peek()
    { // Start of peek method
        return head.data; // Return the data in the head
    } // End of peek method

    double evaluateExpression(String input)
    { // Start of evaluateExpression method
        ReversePolishNotation number_stack = new ReversePolishNotation(); // Create new stack instance for the numbers being inputted
        double number = 0.0;

        for(int i = 0; i < input.length(); i++)
        { // Start of for loop
            if(input.charAt(i) == '+')
                number_stack.push(number_stack.pop() + number_stack.pop()); // Add the last to 2 nodes and push the new result back to the stack
            else if(input.charAt(i) == '-')
            { // Start of else if block
                double num1 = number_stack.pop(); // Pop the head of the stack and set it equal to num1
                double num2 = number_stack.pop(); // Set num2 equal to the head of the stack and remove it
                number_stack.push(num2 - num1); // Subtract the 2 pieces of data and push the result back to the stack
            } // End of else if block
            else if(input.charAt(i) == '*')
                number_stack.push(number_stack.pop() * number_stack.pop()); // Multiply the last 2 pieces of data and push the result back to the stack
            else if(input.charAt(i) == '/')
            { // Start of else if block
                double num1 = number_stack.pop(); // Set num1 equal to the head of the stack, remove the head
                double num2 = number_stack.pop(); // Set num2 equal to the head of the stack, remove the head
                number_stack.push(num2 / num1); // Divide the two numbers and push it back to the stack
            } // End of else if block
            else
            { // Start of else block
                number = Double.parseDouble(String.valueOf(input.charAt(i)));
                number_stack.push(number); // This must be a number at this point, so convert it to a double
            } // End of else block
        } // End of for loop
        return number_stack.pop(); // Return the head of the node
    } // End of evaluateExpression method
} // End of ReversePolishNotation class

public class ReversePolishNotation_Tester
{ // Start of ReversePolishNotation_Tester class
    public static void main(String[] args)
    { // Start of main method
        ReversePolishNotation rpn = new ReversePolishNotation(); // Create new instantiation of ReversePolishNotation, in which we will store the numbers and evaluate
        String input = ""; // String which will store the user input
        String anotherExpression = "";
        Scanner scanner = new Scanner(System.in); // Scanner to help us receive user input

        while(true)
        { // Start of while loop
            System.out.print("Please enter a valid Reverse Polish Notation Expression: "); // Tell the user to input a valid expression
            input = scanner.nextLine(); // Store the user input under the input variable
            String newInput = input.replaceAll("\\s+", ""); // Gets rid of all spaces in the string

            System.out.println("\n\nThe result of this expression is: " + rpn.evaluateExpression(newInput)); // Display the result of the expression to the user
            System.out.print("\nWould you like to enter another expression[Y/N]: "); // Ask the user if they would like to enter another expression
            anotherExpression = scanner.nextLine(); // Store user response under anotherExpression variable

            if(anotherExpression.equalsIgnoreCase("y") || anotherExpression.equalsIgnoreCase("yes"))
                continue; // Go back to the top of the while loop
            else
                System.exit(1); // Close the program
        } // End of while loop
    } // End of main method
} // End of ReversePolishNotation_Tester class
