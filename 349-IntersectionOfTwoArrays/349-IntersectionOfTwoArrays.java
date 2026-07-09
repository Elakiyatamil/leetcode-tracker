// Last updated: 09/07/2026, 09:51:43
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Store elements of nums1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check elements of nums2
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Convert set to array
        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }
        return ans;
    }
}
