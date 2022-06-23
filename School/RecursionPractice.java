import java.util.Scanner;
public class RecursionPractice {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(cube(4));
        System.out.println(fibonacci(5));
    }

    private static int factorial(int value) {


        if(value == 1) {
            return 1;
        }

        return factorial(value - 1) * value;
    }

    static int fibonacci(int number) {
        if (number < 2)
            return number;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    private static int cube(int value) {
        return (value * value * value);
    }
}
