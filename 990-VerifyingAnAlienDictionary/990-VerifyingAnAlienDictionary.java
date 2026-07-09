// Last updated: 09/07/2026, 09:48:41
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // Map each character to its rank in alien order
        int[] rank = new int[26];
        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }
        // Compare each adjacent pair of words
        for (int i = 0; i < words.length - 1; i++) {
            if (!inCorrectOrder(words[i], words[i + 1], rank)) {
                return false;
            }
        }
        return true;
    }
    private boolean inCorrectOrder(String w1, String w2, int[] rank) {
        int len = Math.min(w1.length(), w2.length());
        for (int i = 0; i < len; i++) {
            char c1 = w1.charAt(i), c2 = w2.charAt(i);
            if (c1 != c2) {
                return rank[c1 - 'a'] < rank[c2 - 'a'];
            }
        }
        // If all characters match up to min length, shorter word should come first
        return w1.length() <= w2.length();
    }
}