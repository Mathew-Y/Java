// LinkedListExample.java

import java.util.*; // Import all classes in java.util directory
import java.util.LinkedList; // Import LinkedList class

public class LinkedListExample
{ // Start of LinkedListExample class
    List InfoList = new LinkedList<String>(); // Class variable which will store all info, saves Strings

        public void doLinkedListExample()
        { // Start of doLinkedListExample method
            // add data to linked list

            InfoList.add("Computer"); // string
            InfoList.add("Programs");
            InfoList.add("in Java");

            Iterator i = InfoList.iterator(); // prints out InfoList contents
            while (i.hasNext())
            { // Start of while loop
                System.out.println(i.next()); // Print out the next element
            } // End of while loop

            // show what node points to (i.e. what is previous and next in list)
            int counter = 0; // Counter which will keep track of the elements in the list
            ListIterator Info = InfoList.listIterator(); // ListIterator which will allow us to Iterate through our list
            while (Info.hasNext())
            { // Start of while loop

                // Output Data of our List
                System.out.println("Element [" + counter + "] = " + Info.next());
                System.out.println(" - hasPrevious = " + Info.hasPrevious());
                System.out.println(" - hasNext = " + Info.hasNext());
                System.out.println(" - previousIndex = " + Info.previousIndex());
                System.out.println(" - nextIndex = " + Info.nextIndex());
                System.out.println(); // Formatting line
                counter++; // Increment counter by 1
            } // End of while loop


            // checking to see if the linked list is empty
            System.out.println("Is InfoList empty? " + InfoList.isEmpty());
            System.out.println("InfoList contents now : " + InfoList);
            // clear the linked list
            System.out.println ("Empty InfoList ");
            InfoList.clear();
            System.out.println("InfoList contents now : " + InfoList);

            // Add 3 elements
            InfoList.add("Peanut");
            InfoList.add("Butter");
            InfoList.add("Dog");
            System.out.println(InfoList.toString());

            // Remove 2 elements
            InfoList.remove("Peanut");
            InfoList.remove("Dog");
            System.out.println("\n" + InfoList.toString());

            // Filling LinkedList with Random data to be able to sort
            InfoList.add("Mathew");
            InfoList.add("Daniel");
            InfoList.add("Kyle");
            InfoList.add("Jesse");
            InfoList.add("Comp Sci");

            System.out.println("\nOriginal List: " + InfoList.toString()); // Prints out the original list prior to reversing

            InfoList.sort(new Comparator<String>()
            { // Start of sort call
                @Override
                public int compare(String obj1, String obj2)
                { // Start of compare method
                    if (obj1 == obj2)
                        return 0; // Return 0 back to main
                    if (obj1 == null)
                        return -1; // Return -1 back to main
                    if (obj2 == null)
                        return 1; // Return 1 back to main
                    return obj1.compareTo(obj2); // Return the comparison between obj1 and obj2
                } // End of compare method
            }); // End of sort call

            System.out.println("Reversed List: " + InfoList.toString()); // Output the reversed list

            String inList = "Daniel"; // String which will store data that is in the list
            String notInList = "Ceccato"; // String which will store data that is not in the list

            // Check if our String in the list is found or not
                if(InfoList.contains(inList))
                    System.out.println(inList + " has been found in the list."); // Tell the user that the String has been found in the list
                else
                    System.out.println(inList + " has not been found in the list."); // Tell the user that the String has not been found in the list


            // Check if our String that is not in the list is found or not
                if(InfoList.contains(notInList))
                    System.out.println(notInList + " has been found in the list."); // Tell the user that the String has been found in the list
                else
                    System.out.println(notInList + " has not been found in the list"); // Tell the user that the String has not been found in the list
        } // End of doLinkedListExample method

    public static void main(String[] args)
    { // Start of main method
        LinkedListExample listExample = new LinkedListExample(); // Create a new LinkedListExample instance
        listExample.doLinkedListExample(); // Call the doLinkedListExample method
    } // End of main method
} // End of LinkedListExample class