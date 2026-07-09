// Last updated: 09/07/2026, 09:46:21
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;
        // Check all pairs (i, j) where i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}