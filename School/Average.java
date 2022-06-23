import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfMarks;
        double[] marks;
        double value = 0;
        double average = 0;

        System.out.println("Please enter the number of marks: ");
        numOfMarks = scanner.nextInt();

        marks = new double[numOfMarks];

        for(int i = 0; i < numOfMarks; i++) {
                System.out.println("Please enter a mark:");
                marks[i] = scanner.nextDouble();
                value += marks[i];
                average = value / numOfMarks;
        }
        System.out.println("The average of the class is: " + average);
    }
}
