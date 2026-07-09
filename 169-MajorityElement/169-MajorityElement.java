// Last updated: 09/07/2026, 09:52:49
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            // choose new candidate
            if (count == 0) {
                candidate = num;
            }
            // increase or decrease count
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}