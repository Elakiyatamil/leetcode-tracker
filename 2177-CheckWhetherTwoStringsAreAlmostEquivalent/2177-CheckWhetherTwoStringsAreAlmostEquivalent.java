// Last updated: 09/07/2026, 09:46:31
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
         int[] freq = new int[26];

        // Count word1
        for (char c : word1.toCharArray()) {
            freq[c - 'a']++;
        }

        // Subtract word2
        for (char c : word2.toCharArray()) {
            freq[c - 'a']--;
        }

        // Check condition
        for (int i = 0; i < 26; i++) {
            if (Math.abs(freq[i]) > 3) {
                return false;
            }
        }

        return true;
    }
}