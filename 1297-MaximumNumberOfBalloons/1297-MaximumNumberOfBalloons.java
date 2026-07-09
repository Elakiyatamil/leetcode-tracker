// Last updated: 09/07/2026, 09:47:41
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        // Count frequency
        for (char c : text.toCharArray()) {
            freq[c - 'a']++;
        }

        // Calculate possible "balloon"
        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2;
        int o = freq['o' - 'a'] / 2;
        int n = freq['n' - 'a'];

        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}