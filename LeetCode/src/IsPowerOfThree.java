public class IsPowerOfThree {

    public static void main(String[] args) {

        int num = 1162261467;

        System.out.println( "Factors of " + num + " are " );

        // finding and printing factors b/w 1 to num
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.println(i + " ");
        }

    }

    public static boolean isPowerOfThree(int n) {
        int largestPower = (int) Math.pow(3, 19);

        return n > 0 && largestPower % n == 0;
    }
}
