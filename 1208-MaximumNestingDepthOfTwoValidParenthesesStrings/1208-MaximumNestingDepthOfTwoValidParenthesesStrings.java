// Last updated: 09/07/2026, 09:48:14
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        int depth = 0;
        for (int i = 0; i < n; i++) {
            char c = seq.charAt(i);
            if (c == '(') {
                depth++;
                ans[i] = depth % 2; // alternate assignment
            } else {
                ans[i] = depth % 2;
                depth--;
            }
        }
        return ans;
    }
}