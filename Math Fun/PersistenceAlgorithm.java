import java.util.Arrays;

public class PersistenceAlgorithm {
    public static int[] highestPersistenceArr;
    public static int highestPersistence;

    public static void main(String[] args) {

//        int[] starting = {2, 7, 7};
//        int[] highestStepsArr = starting;
//        int highestSteps = 0;
//        int counter = 0;

        int startingLength = 868;

        runScript(startingLength);



//        int[] sampleTest = {9, 9, 9, 9, 9, 9, 9, 9, 9};
//
//        int[] persistenceTest = {2, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9};
//
//        System.out.println(Arrays.toString(multiplyIndices(sampleTest)));
//        System.out.println(persistence(persistenceTest));

//        while(counter < 500000000) {
//            int currentSteps = persistence(starting);
//            if(currentSteps > highestSteps) {
//                highestStepsArr = Arrays.copyOf(starting, starting.length);
//                highestSteps = currentSteps;
//            }
//            System.out.println(Arrays.toString(starting) + " --> " + currentSteps + " steps.      Current record held by: " + Arrays.toString(highestStepsArr) + " with persistence of " + highestSteps + " steps.");
//            starting = incrementArray(starting);
//            counter++;
//        }

    }

    public static int[] incrementArray(int[] digits) {
        int[] copy = digits;

        // [4, 3, 6, 7]

        if(copy[copy.length - 1] != 9) {
            copy[copy.length - 1]++;
        }
        else {
            int currentCharIndex = copy.length - 1;

            // [4, 5, 9, 9]
            //     c

            while(copy[currentCharIndex] == 9) {
                if(currentCharIndex == 0) {
                    copy[currentCharIndex] = 0;
                    int[] newNumArray = new int[copy.length + 1];
                    Arrays.fill(newNumArray, 0);
                    newNumArray[0] = 1;
                    copy = newNumArray;
                    return copy;
                }

                copy[currentCharIndex] = 0;
                currentCharIndex--;
            }

            copy[currentCharIndex]++;
        }

        return copy;
    }

    // 277777788888899

    public static int[] multiplyIndices(int[] digits) {
        // [4, 3, 6, 9]

        int[] multiplicativeArr = {digits[0]};
        int carry = 0;

        for(int i = 1; i < digits.length; i++) {
            carry = 0;
            int[] tempArr = new int[multiplicativeArr.length];
            for(int j = multiplicativeArr.length - 1; j >= 0; j--) {
                int product = digits[i] * multiplicativeArr[j];
                if(carry > 0) {
                    product += carry;
                    carry = 0;
                }
                if(product > 9) {
                    carry = product / 10;
                    int onesValue = product % 10;
                    if(j == 0) {

                        // [7, 2] x 9
                        int[] copyArr = new int[tempArr.length + 1];
                        for(int k = 1; k < tempArr.length; k++) {
                            copyArr[k+1] = tempArr[k];
                        }
                        copyArr[0] = carry;
                        copyArr[1] = onesValue;

                        tempArr = copyArr;
                        multiplicativeArr = tempArr;
                        break;
                    }

                    tempArr[j] = onesValue;

                }
                else {
                    tempArr[j] = product;
                }

                if(j == 0) {
                    multiplicativeArr = tempArr;
                }
            }
        }

        return multiplicativeArr;

    }
    /**

     {1, 2, 3, 4}

     {1, 2, 3, 4}
     while (at least two elems)
        multiply indices?


     * **/
    public static int persistence(int[] currentNum) {
        int steps = 0;

        int[] persistenceArr = currentNum;

        while(persistenceArr.length > 1) {
            persistenceArr = multiplyIndices(persistenceArr);
            steps++;
        }

        return steps;
    }

    public static void runScript(int digits) {

        int[] numArray = new int[digits];
        int currentPersistence = 0;

        for(int i = 0; i < 2; i++) {
            numArray[0] = i + 2;

            // [2, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]

            for(int sevens = 1; sevens < (digits - 2); sevens++) {
                for(int eights = 1; eights < digits - sevens - 1; eights++) {
                    int nines = digits - sevens - eights - 1;
                    for(int putSevens = 1; putSevens <= sevens; putSevens++) {
                        numArray[putSevens] = 7;
                    }
                    for(int putEights = 1 + sevens; putEights < eights + 1 + sevens; putEights++) {
                        numArray[putEights] = 8;
                    }
                    for(int putNines = 1 + sevens + eights; putNines < nines + sevens + eights + 1; putNines++) {
                        numArray[putNines] = 9;
                    }
                    currentPersistence = persistence(numArray);
                    if(currentPersistence > highestPersistence) {
                        highestPersistence = currentPersistence;
                        highestPersistenceArr = Arrays.copyOf(numArray, numArray.length);
                    }

                    System.out.println(Arrays.toString(numArray) + " --> " + currentPersistence + " steps.        Current Record held by: " + Arrays.toString(highestPersistenceArr) + " with persistence of " + highestPersistence + " steps.   Current digits: " + digits);
                }
            }
        }

        runScript(digits + 1);

    }
}
