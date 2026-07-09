// Last updated: 09/07/2026, 09:52:42
class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        k %= n; // Handle cases where k is larger than the array's length
        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining elements from index k to the end
        reverse(nums, k, n - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}