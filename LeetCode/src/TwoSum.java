import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 12, 9};
        System.out.println(Arrays.toString(twoSum(numbers, 5)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> reqNumbers = new Hashtable<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            Integer reqNumber = (Integer)(target - nums[i]);
            if(reqNumbers.containsKey(reqNumber)) {
                int arr[] = {reqNumbers.get(reqNumber), i};
                return arr;
            }
            reqNumbers.put(nums[i], i);

        }
        return null;
    }
}
