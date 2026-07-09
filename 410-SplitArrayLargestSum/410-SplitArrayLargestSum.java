// Last updated: 09/07/2026, 09:51:19
class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;

        // Define search space
        for (int num : nums) {
            low = Math.max(low, num); // max element
            high += num;              // total sum
        }

        // Binary search on answer
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid;   // try smaller max sum
            } else {
                low = mid + 1; // need bigger max sum
            }
        }

        return low;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrays = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                subarrays++;
                currentSum = num;
                if (subarrays > k) return false;
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}
