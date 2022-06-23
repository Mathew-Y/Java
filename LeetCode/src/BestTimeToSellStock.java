import java.util.Hashtable;
import java.util.Collections;

public class BestTimeToSellStock {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, -4, 7, -13, 4, 8, -2, 7};
        int maxSumSubArray = maxSubArray(arr);
        System.out.println(maxSumSubArray);
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int bestProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            bestProfit = Math.max(prices[i] - min, bestProfit);
            min = Math.min(prices[i], min);
        }
        return bestProfit;
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = maxSum;

        System.out.println("CurrentSum: " + currentSum);
        System.out.println("maxSum: " + maxSum);

        for(int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);

            System.out.println("\nCurrentSum: " + currentSum);
            System.out.println("maxSum: " + maxSum);
        }

        return maxSum;

    }
}
