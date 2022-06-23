import java.util.Scanner;


public class riemannszetafunction {

    public static void main(String[] args) {

        int k = 1;
        double s = 0.0;
        int counter = 1;
        double sum = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number for s: ");
        s = scan.nextDouble();

        while(true) {
            sum += (1/(Math.pow(k, s)));
            System.out.println("sum for k = " + k + ": " + sum);
            k += 1;
//            counter++;
        }

    }
}
