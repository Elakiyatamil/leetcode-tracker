// Last updated: 09/07/2026, 09:47:31
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;

        for (int num : nums) {
            right = Math.max(right, num);
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isValid(nums, mid, threshold)) {
                answer = mid;
                right = mid - 1;   // try smaller divisor
            } else {
                left = mid + 1;    // need bigger divisor
            }
        }

        return answer;
    }

    private boolean isValid(int[] nums, int d, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + d - 1) / d; // ceil(num / d)
            if (sum > threshold) return false;
        }
        return true;
    }
}
