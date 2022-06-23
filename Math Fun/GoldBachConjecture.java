import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class GoldBachConjecture {

    public static int threshhold = 10000000;

    public static void main(String[] args) {
        calculateNPrimeNumbers(threshhold);
    }

    public static void calculateNPrimeNumbers(int n) {
        boolean[] compositeMap = new boolean[n+1];
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        ArrayList<Integer> sumsNeeded = new ArrayList<>();

        for (int i = 2; i <= (int) Math.ceil(Math.sqrt(n)); i++) {
            if (compositeMap[i] == false) {
                for (int j = i + i; j <= n; j += i) {
                    compositeMap[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (compositeMap[i] == false) {
                primeNumbers.add(i);
                System.out.print(i + ", ");
            }
        }

        int counter = 4;

        while(true) {
            int numOfSums = 0;

            for(int i = 0; i < counter; i++) {
                if(primeNumbers.get(i) < counter) {
                    sumsNeeded.add(primeNumbers.get(i));
                    if(sumsNeeded.contains(counter - primeNumbers.get(i))) {
                        System.out.println(counter + ": " + (counter - primeNumbers.get(i)) + " + " + primeNumbers.get(i));
                    }
                }
            }
            sumsNeeded.clear();
            counter += 2;
        }

//        while(true) {
//            int numOfSums = 0;
//
//            for(int i = 0; i < counter; i++) {
//                if(primeNumbers.get(i) < counter) {
//                    sumsNeeded.add(primeNumbers.get(i));
//                    if(sumsNeeded.contains(counter - primeNumbers.get(i))) {
//                        if((counter - primeNumbers.get(i)) == primeNumbers.get(i)) {
//                            System.out.println(counter + ": " + (counter - primeNumbers.get(i)) + " + " + primeNumbers.get(i));
//                            numOfSums++;
//                        }
//                    }
//                }
//            }
//            sumsNeeded.clear();
//            counter += 2;
//        }
    }
}

