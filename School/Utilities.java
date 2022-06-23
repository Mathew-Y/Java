public class Utilities {
    public static void main(String[] args) {
        sumofEvensandOdds(7, 10);
    }

    public static String sumofEvensandOdds(int lowerLimit, int upperLimit) {
        final int RANGE = (upperLimit - lowerLimit) + 1;
        int evenSum = 0;
        int oddSum = 0;
        boolean currIsEven = true;

        if(lowerLimit % 2 != 0) {
            currIsEven = false;
        }

        for(int i = lowerLimit; i <= upperLimit; i++) {
            if(currIsEven) {
                evenSum += i;
            }
            else {
                oddSum += i;
            }
            currIsEven = !currIsEven;
        }

        System.out.println(oddSum);
        System.out.println(evenSum);

        return "";
    }

}
