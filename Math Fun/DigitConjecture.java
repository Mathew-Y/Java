import java.util.ArrayList;
import java.util.Arrays;

public class DigitConjecture {

    public static void main(String[] args) {
        int[] start = {1};
        int stepCounter = 0;
        int productOfDigits = 1;

        while(true) {
            stepCounter = 0;
            productOfDigits = 1;

            if(start.length == 1) {
                System.out.println(Arrays.toString(start) + " takes 0 steps to complete.");
                start = addOne(start);
                continue;
            }

            for(int i = 0; i < start.length; i++) {
                productOfDigits *= start[i];
            }

            stepCounter++;

            while(productOfDigits > 9) {
                String stringOfProducts = Integer.toString(productOfDigits);
//                char[] temp = stringOfProducts.toCharArray();
                productOfDigits = 1;

//                System.out.println(stringOfProducts);
//                System.out.println(Arrays.toString(temp));

                for(int i = 0; i < stringOfProducts.length(); i++) {
                    int temporary = stringOfProducts.charAt(i) - '0';
//                    int temporary = Integer.parseInt(String.valueOf(stringOfProducts.charAt(i)));
                    productOfDigits *= temporary;
                }

                stepCounter++;
            }

            System.out.println(Arrays.toString(start) + " takes " + stepCounter + " steps to complete.");

            if(stepCounter >= 8) {
                break;
            }

            start = addOne(start);
        }

    }

    public static int[] addOne(int[] digits) {
        int i = 1;
        int nineCounter = 0;

        for(int x = 0; x < digits.length; x++) {
            if(digits[digits.length - x - 1] == 9) {
                nineCounter++;
            }
        }

        if(nineCounter == digits.length) {
            digits = new int[digits.length + 1];

            digits[0] = 1;

            for(int y = 1; y < digits.length; y++) {
                digits[y] = 0;
            }
            return digits;
        }

        while(digits[digits.length - i] == 9) {
            digits[digits.length - i] = 0;

            i++;
        }

        digits[digits.length - i] += 1;

        return digits;
    }
}
