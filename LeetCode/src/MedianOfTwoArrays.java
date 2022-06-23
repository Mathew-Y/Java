import java.util.Arrays;

public class MedianOfTwoArrays {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int arr1 = nums1.length;
        int arr2 = nums2.length;
        int newLength = arr1 + arr2;

        int[] mergedArray = new int[newLength];

        System.arraycopy(nums1, 0, mergedArray, 0, arr1);
        System.arraycopy(nums2, 0, mergedArray, arr1, arr2);
        Arrays.sort(mergedArray);

        System.out.println(Arrays.toString(mergedArray));

        if(mergedArray.length % 2 == 0) {
            median = (mergedArray[(mergedArray.length / 2) - 1] + mergedArray[(mergedArray.length / 2)]) / 2.0;
        }
        else {
            median = mergedArray[(mergedArray.length / 2)];
        }

        System.out.println("Median: " + median);
        return median;
    }

    public static void main(String[] args) {
        int[] num1 = {4, 5, 9, 7};
        int[] num2 = {8, 10, 12, 2};

        findMedianSortedArrays(num1, num2);
    }
}
