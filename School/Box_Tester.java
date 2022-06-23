class Box // A class that implements a cardboard box
{ // Start of Box class

    // State Variables
    double width = 0.0; // Width of the box
    double height = 0.0; // Height of the box
    double length = 0.0; // Length of the box

    // Constructors 2 of them, one needs all 3 values to make a box
    Box(double width, double height, double length)
    { // Start of normal Box constructor
        this.width = width; // Set the width of the box to the given width from the testing class
        this.height = height; // Set the height of the box to the given height from the testing class
        this.length = length; // Set the given length of the box to the given length from the testing class
    } // End of normal Box constructor

    Box(double side)
    { // Start of cube Box constructor
        this.width = side; // Set the width of the box to the given side when creating the cube Box object
        this.height = side; // Set the height of the box to the given side when creating the cube Box object
        this.length = side; // Set the length of the box to the given side when creating the cube Box object
    } // End of cube Box constructor

    Box(Box oldBox)
    { // Start of same Box instance constructor
        this.width = oldBox.width; // Set the width of the new box to the same width of the old box
        this.height = oldBox.height; // Set the height of the new box to the same height of the old box
        this.length = oldBox.length; // Set the length of the new box to the same length of the old box
    } // End of same Box instance constructor

    double Volume() // This method will calculate the volume and return the volume to the testing class
    { // Start of Volume method
        return (width * height * length); // return the volume of the box to the testing class
    } // End of Volume method

    double Area() // This method will calculate the area of the length and width of the box and return the area to the testing class
    { // Start of Area method
        return (length * width); // Return the area of the box to the testing class
    } // End of Area method

    double Left_Side_Area() // Method that will calculate the left side area of the box
    { // Start of Left_Side_Area method
        return (width * height); // Return the left side area of the box to the testing class
    } // End of Left_Side_Area method

    double Top_Side_Area() // Method that will calculate the top side area of the box
    {  // Start of Top_Side_Area method
        return (length * width); // Return the top side area of the box to the testing class
    } // End of Top_Side_Area method

    double Front_Side_Area() // Method that will calculate the front side area of the box
    { // Start of Front_Side_Area method
        return (length * height); // Return the front side area of the box to the testing class
    } // End of Front_Side_Area method

    void Display_Length() // Method that will display the length of the box, it is void return type because it doesn't return anything back to the class, it only prints out information
    { // Start of Display_Length method
        System.out.format("%s%.2f%n", "Length: ", length); // Print out the length of the Box
    } // End of Display_Length method

    void Display_Width() // Method that will display the width of the box, it is void return type because it doesn't return anything back to the class, it only prints out information
    { // Start of Display_Width method
        System.out.format("%s%.2f%n", "Width: ", width); // Print out the width of the Box
    } // End of Display_Width method

    void Display_Height() // Method that will display the height of the box, it is void return type because it doesn't return anything back to the class, it only prints out information
    { // Start of Display_Height method
        System.out.format("%s%.2f%n", "Height: ", height); // Print out the height of the Box
    } // End of Display_Height method

    double Get_Width()
    { // Start of width getter method
        return width; // Return the width back to the tester class
    } // End of Width getter method

    double Get_Height()
    { // Start of height getter method
        return height; // Return the height back to the tester class
    } // End of height getter method

    double Get_Length()
    {  // Start of length getter method
        return length; // Return the length back to the tester class
    } // End of length getter method

    void Set_Width(double width)
    { // Start of width setter method
        this.width = width; // Set the variable width to the width entered in the parameter
    } // End of width setter method

    void Set_Height(double height)
    { // Start of height setter method
        this.height = height; // Set the variable height to the width entered in the parameter
    } // End of height setter method

    void Set_Length(double length)
    { // Start of length setter method
        this.length = length; // Set the variable length to the width entered in the parameter
    } // End of length setter method

    public Box biggerBox(Box oldBox)
    { // Start of biggerBox method
        return new Box((1.25 * oldBox.width), (1.25 * oldBox.height), (1.25 * oldBox.length)); // Create a new box with all the same dimensions multiplied by 1.25
    } // End of biggerBox method

    boolean nests(Box outsideBox)
    { // Start of nests method
        if(outsideBox.Volume() > Volume()) // Checks if the box can fit in the box they entered in the parameters of the method
            return true; // Return true back to the testing class
        else // If the box cannot fit
            return false; // Return false back to the testing class
    } // End of nests method

} // End of Box class

class Box_Tester
{ // Start of Box_Tester class

    public static void main(String[] args)
    { // Start of main method
        Box box1 = new Box(4, 8, 9); // Create a new Box called box1, give it the width of 4, the height of 8, and the length of 9
        Box box2 = new Box(10); // Create a new Box called box2, give its 3 dimensions the length of 10
        Box box3 = new Box(box1); // Create a new box called box3, store the exact same dimensions as box1
        Box box4 = new Box(box2.biggerBox(box2)); // Create a new box called box4, store the same dimensions as box2, but multiplied by 1.25

            System.out.format("%s%.2f%n", "box1's Volume: ", box1.Volume()); // Output the Volume of box1
            System.out.format("%s%.2f%n%n", "box1's Area: ", box1.Area()); // Output the Area of box1

            box1.Display_Length(); // Prints out the length of box1
            box1.Display_Width(); // Prints out the width of box1
            box1.Display_Height(); // Prints out the height of box1

            System.out.println(); // Skip a line in the console

            System.out.format("%s%.2f%n", "box1's Left Side Area: ", box1.Left_Side_Area()); // Prints out the left side area of box1
            System.out.format("%s%.2f%n", "box1's Top Side Area: ", box1.Top_Side_Area()); // Prints out the top side area of box1
            System.out.format("%s%.2f%n%n", "box1's Front Side Area: ", box1.Front_Side_Area()); // Prints out the front side area of box1

            System.out.format("%s%.2f%n", "box2's Volume: ", box2.Volume()); // Output the Volume of box2
            System.out.format("%s%.2f%n%n", "box2's Area: ", box2.Area()); // Output the Area of box2

            box2.Display_Length(); // Prints out the length of box2
            box2.Display_Width(); // Prints out the width of box2
            box2.Display_Height(); // Prints out the height of box2

            System.out.println(); // Skip a line in the console

            System.out.format("%s%.2f%n", "box2's Left Side Area: ", box2.Left_Side_Area()); // Prints out the left side area of box2
            System.out.format("%s%.2f%n", "box2's Top Side Area: ", box2.Top_Side_Area()); // Prints out the top side area of box2
            System.out.format("%s%.2f%n%n", "box2's Front Side Area: ", box2.Front_Side_Area()); // Prints out the front side area of box2

            System.out.format("%s%.2f%n", "box3's Volume: ", box3.Volume()); // Output the Volume of box3
            System.out.format("%s%.2f%n%n", "box3's Area: ", box3.Area()); // Output the Area of box3

            box3.Display_Length(); // Prints out the length of box3
            box3.Display_Width(); // Prints out the width of box3
            box3.Display_Height(); // Prints out the height of box3

            System.out.println(); // Skip a line in the console

            System.out.format("%s%.2f%n", "box3's Left Side Area: ", box3.Left_Side_Area()); // Prints out the left side area of box3
            System.out.format("%s%.2f%n", "box3's Top Side Area: ", box3.Top_Side_Area()); // Prints out the top side area of box3
            System.out.format("%s%.2f%n%n", "box3's Front Side Area: ", box3.Front_Side_Area()); // Prints out the front side area of box3

            System.out.format("%s%.2f%n", "box4's Volume: ", box4.Volume()); // Output the Volume of box4
            System.out.format("%s%.2f%n%n", "box4's Area: ", box4.Area()); // Output the Area of box4

            System.out.format("%s%.2f%n", "box4's Length: ", box4.Get_Length()); // Prints out the length of box4
            System.out.format("%s%.2f%n", "box4's Width: ", box4.Get_Width()); // Prints out the width of box4
            System.out.format("%s%.2f%n%n", "box4's Height: ", box4.Get_Height()); // Prints out the height of box4

            System.out.format("%s%.2f%n", "box4's Left Side Area: ", box4.Left_Side_Area()); // Prints out the left side area of box4
            System.out.format("%s%.2f%n", "box4's Top Side Area: ", box4.Top_Side_Area()); // Prints out the top side area of box4
            System.out.format("%s%.2f%n%n", "box4's Front Side Area: ", box4.Front_Side_Area()); // Prints out the front side area of box4

            box4.Set_Length(17); // Set the length of box4 to 17
            box4.Set_Width(15); // Set the width of box4 to 15
            box4.Set_Height(20); // Set the height of box4 to 20

            System.out.format("%s%.2f%n", "box4's New Volume: ", box4.Volume()); // Output the new Volume of box4
            System.out.format("%s%.2f%n%n", "box4's New Area: ", box4.Area()); // Output the new Area of box4

            System.out.format("%s%.2f%n", "box4's New Length: ", box4.Get_Length()); // Prints out the new length of box4
            System.out.format("%s%.2f%n", "box4's New Width: ", box4.Get_Width()); // Prints out the new width of box4
            System.out.format("%s%.2f%n%n", "box4's New Height: ", box4.Get_Height()); // Prints out the new height of box4

            System.out.format("%s%.2f%n", "box4's New Left Side Area: ", box4.Left_Side_Area()); // Prints out the new left side area of box4
            System.out.format("%s%.2f%n", "box4's New Top Side Area: ", box4.Top_Side_Area()); // Prints out the new top side area of box4
            System.out.format("%s%.2f%n%n", "box4's New Front Side Area: ", box4.Front_Side_Area()); // Prints out the new front side area of box4

                if(box1.nests(box2)) // Calls the nests method and checks if it evaluates to true
                    System.out.format("%s%n", "The box fits!"); // Inform the user that the box does indeed fit
                else // If the nests method evaluates to false
                    System.out.format("%s%n", "The box doesn't fit."); // Inform the user that the box does not fit


    } // End of main method
} // End of Box_Tester class