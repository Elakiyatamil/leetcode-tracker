// Last updated: 09/07/2026, 09:47:42
class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int noDelete = arr[0];     // max sum ending here without deletion
        int oneDelete = 0;         // max sum ending here with one deletion
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            // If we delete current element, oneDelete = noDelete (previous best without deletion)
            // Or continue with previous oneDelete + arr[i]
            oneDelete = Math.max(noDelete, oneDelete + arr[i]);

            // Standard Kadane’s update for noDelete
            noDelete = Math.max(arr[i], noDelete + arr[i]);

            // Track global maximum
            maxSum = Math.max(maxSum, Math.max(noDelete, oneDelete));
        }
        return maxSum;
    }
}
