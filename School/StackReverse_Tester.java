import java.util.Scanner; // Importing Scanner class

class Node
{ // Start of Node class
    String name = ""; // Variable which will store the data in the node
    Node next = null; // Variable which will store the next node in the stack

    Node(String name)
    { // Start of Node constructor
        this.name = name; // Assign the class variable data equal to the data in the user passes in
        next = null; // Set the next node equal to null
    } // End of Node constructor
} // End of Node class

class StackReverse
{ // Start of StackReverse class
    Node head = null; // Variable which will store the head of the stack
    int size = 0; // Variable which will store the size of the stack

    void push(String name)
    { // Start of push method
        Node newNode = new Node(name); // Node which will store the new node being added to the stack
        newNode.next = head; // Setting the newNode's link equal to the head
        head = newNode; // Setting the head equal to the new node
        size++; // Increment size by 1
    } // End of push method

    String pop()
    { // Start of pop method
        String popped = head.name; // Variable which will store the data from the node being popped
        head = head.next; // Set the head of the stack equal to the node after the head
        size--; // Decrement size by 1
        return popped; // Return the popped Node back to the main method
    } // End of pop method

    void print()
    { // Start of print method
        Node curr = head; // Node which will keep track of the head

        while(curr != null)
        { // Start of while loop
            System.out.print(curr.name + ", "); // Output the data in the current node
            curr = curr.next; // Move to the next node in the list
        } // End of while loop
    } // End of print method

    void reverse()
    { // Start of reverse method
        StackReverse reversed = new StackReverse(); // Creation of a temporary reverse stack

        while(this.head != null)
            reversed.push(this.pop()); // Push the peek node of the stack into the reversed stack

        this.head = reversed.head; // Restore values back to main stack
        this.size = reversed.size; // Reset size of stack
    } // End of reverse method
} // End of StackReverse class

public class StackReverse_Tester
{ // Start of StackReverse_Tester class
    public static void main(String[] args)
    { // Start of main method
        StackReverse stack = new StackReverse(); // Instantiate StackReverse class
        Scanner scanner = new Scanner(System.in); // Creation of Scanner instance
        String input = ""; // Variable which will store user input

        while(true)
        { // Start of while loop
            System.out.print("Please enter a Name (Enter 'e' to exit): "); // Ask user to enter a name
            input = scanner.next(); // Store user input under the input variable

            if(input.equalsIgnoreCase("e"))
                break; // Break out of the loop
            else
                stack.push(input); // Push the user input into the stack
        } // End of while loop

        stack.reverse(); // Reverse the stack
        System.out.print("\nOriginal Order: "); // Output the original order
        stack.print(); // Call print method
        System.out.print("\nReversed Order: "); // Output reversed order
        stack.reverse(); // reverse the stack
        stack.print(); // Call the print method
    } // End of main method
} // End of StackReverse class
