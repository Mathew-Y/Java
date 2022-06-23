import java.util.Arrays;

public class ArrayStuff {

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        System.out.println(Arrays.deepToString(nums));

        transpose(nums);

        System.out.println(Arrays.deepToString(nums));

        reverseRows(nums);

        System.out.println(Arrays.deepToString(nums));
    }

    public static void transpose(int[][] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }

    public static void reverseRows(int[][] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length / 2; j++) {
                int temp = nums[i][nums.length - j - 1];
                nums[i][nums.length - j - 1] = nums[i][j];
                nums[i][j] = temp;
            }
        }
    }
}
