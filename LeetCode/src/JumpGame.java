import java.util.Arrays;

public class JumpGame {

    public static void main(String[] args) {
        int[] sample = {3, 2, 1, 1, 2, 6};

        jump(sample);
    }

    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int k = 1; k <= nums[i]; k++) {
                System.out.println(Arrays.toString(dp));
                if(i + k > dp.length - 1) {
                    break;
                }
                dp[i + k] = Math.min(dp[i] + 1, dp[i + k]);
            }
        }

        return dp[dp.length - 1];
    }
}
