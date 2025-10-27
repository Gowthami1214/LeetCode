class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // Forward product
            leftProduct = (leftProduct == 0 ? 1 : leftProduct) * nums[i];

            // Backward product (pick from n - 1 - i)
            rightProduct = (rightProduct == 0 ? 1 : rightProduct) * nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }
}
