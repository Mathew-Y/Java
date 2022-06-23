import java.util.Scanner;

public class upgradedVersion {

    public static void main(String[] args) {

        double mark = 0;
        double sum = 0;
        boolean done = false;
        String decision = "";
        int counter = 0;
        double average = 0.0;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        while(!done) {
            System.out.println("Please enter a mark: ");
            mark = scan.nextDouble();
            sum += mark;
            counter++;
            System.out.println("Are you finished entering the marks? [Y/N]");
            decision = scan2.nextLine();

            if (decision.equals("Y")  || decision.equals("y")) {
                average = sum / counter;
                done = true;
            }
        }

        System.out.println("The average of the class is: " + average);
    }
}
