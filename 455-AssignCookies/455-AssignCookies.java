// Last updated: 09/07/2026, 09:50:38
import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child pointer
        int j = 0; // cookie pointer
        int count = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // cookie satisfies child
                count++;
                i++;
                j++;
            } else {
                // cookie too small
                j++;
            }
        }
        return count;
    }
}
