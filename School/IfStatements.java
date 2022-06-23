import java.util.Scanner;
public class IfStatements {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;

            System.out.print("Please enter a temperature in degrees Celsius: ");
            celsius = keyboard.nextDouble();

            fahrenheit = (celsius * 2) + 30;

            System.out.format("%s %.2f", "Today's temperature in degrees Fahrenheit is: ", fahrenheit);

    }
}
