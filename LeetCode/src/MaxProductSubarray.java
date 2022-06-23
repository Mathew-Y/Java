public class MaxProductSubarray {

    public static void main(String[] args) {
        int[] sample = {-2, 3, -4};
        int maxProduct = maxProduct(sample);
        System.out.println(maxProduct);
    }

    public static int maxProduct(int[] nums) {
        int result = nums[0];
        int minProduct = 1;
        int maxProduct = 1;

        System.out.println("maxProduct: " + maxProduct);
        System.out.println("minProduct: " + minProduct);
        System.out.println("result: " + result);

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                // swap minProduct with maxProduct
            }

            maxProduct = Math.max(maxProduct*nums[i], nums[i]);
            minProduct = Math.min(minProduct*nums[i], nums[i]);
            result = Math.max(result, maxProduct);

            System.out.println("\nmaxProduct: " + maxProduct);
            System.out.println("minProduct: " + minProduct);
            System.out.println("result: " + result);

        }
        return result;
    }
}
