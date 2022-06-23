import java.util.Arrays;

public class TutorMichael {

    public static void main(String[] args) {

        int[][] nums = {{1, 2, 8},
                        {3, 4, 7}};

        System.out.println(removeOddIndices("ABCDEFG"));
        System.out.println(peakFinder(new int[]{3, 5, 7, 9, 11}));
        System.out.println(majorityOccurrence(new int[]{1, 1, 2, 2, 2}));
        System.out.println(Arrays.deepToString(rotate90CounterClock(nums)));
    }

    public static int[][] rotate90CounterClock(int[][] nums) {
        int[][] outputArr = new int[nums[0].length][nums.length];

        for(int j = nums[0].length - 1; j >= 0; j--) {
            for(int i = 0; i < nums.length; i++) {
                outputArr[nums[0].length - j - 1][i] = nums[i][j];
            }
        }
        return outputArr;
    }

    public static String removeOddIndices(String input) {
        return removeOddIndicesHelper(input, "");
    }

    public static String removeOddIndicesHelper(String input, String progress) {
        // "ABCDEFG" --> "ACEG"

        if(input.length() == 0) {
            return progress;
        }
        else if(input.length() == 1) {
            progress += input;
            return progress;
        }

        progress += input.charAt(0);
        input = input.substring(2, input.length());

        return removeOddIndicesHelper(input, progress);
    }
    // [3, 5, 7, 9, 11]]

    public static int peakFinder(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i < nums.length - 1 && nums[i + 1] > nums[i]) {
                continue;
            }
            return i;
        }
        return 0;
    }

    public static int majorityOccurrence(int[] nums) {
        return majorityOccurrenceHelper(nums, 0, nums.length - 1);
    }

    public static int majorityOccurrenceHelper(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }

        int mid = (start + end) / 2;
        int leftMajority = majorityOccurrenceHelper(nums, start, mid);
        int rightMajority = majorityOccurrenceHelper(nums, mid + 1, end);

        if(leftMajority == 0 && rightMajority != 0) {
            return rightMajority;
        }
        else if(rightMajority == 0 && leftMajority != 0) {
            return leftMajority;
        }
        else if(leftMajority == rightMajority && leftMajority != 0) {
           return leftMajority;
        }
        return 0;
    }
}
