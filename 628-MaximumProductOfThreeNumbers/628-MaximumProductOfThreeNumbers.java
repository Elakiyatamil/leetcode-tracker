// Last updated: 09/07/2026, 09:49:55
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(
            nums[n - 1] * nums[n - 2] * nums[n - 3], // 3 largest
            nums[0] * nums[1] * nums[n - 1]          // 2 smallest + largest
        ); 
    }
}