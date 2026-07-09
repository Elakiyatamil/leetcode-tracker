// Last updated: 09/07/2026, 09:48:46
class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0, high = n;
        int[] perm = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = low++;
            } else {
                perm[i] = high--;
            }
        }

        // At the end, low == high, add the last one
        perm[n] = low;
        return perm;
    }
}
