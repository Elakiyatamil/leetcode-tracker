// Last updated: 09/07/2026, 09:46:13
class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int count = 0;
        // Try all subarrays [l, r]
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                if (isStrictlyIncreasingAfterRemoval(nums, l, r)) {
                    count++;
                }
            }
        }
        return count;
    }
    // Helper function to check if array is strictly increasing after removing subarray [l, r]
    private boolean isStrictlyIncreasingAfterRemoval(int[] nums, int l, int r) {
        int prev = -1; // since nums[i] >= 1, we can safely start with 0 or -1
        for (int i = 0; i < nums.length; i++) {
            if (i >= l && i <= r) continue; // skip subarray
            if (prev != -1 && nums[i] <= prev) return false;
            prev = nums[i];
        }
        return true;
    }
}