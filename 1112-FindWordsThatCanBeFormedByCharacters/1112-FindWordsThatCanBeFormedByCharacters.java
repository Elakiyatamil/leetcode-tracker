// Last updated: 09/07/2026, 09:48:24
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }
        int totalLength = 0;
        for (String word : words) {
            if (canForm(word, charCount)) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }
    private boolean canForm(String word, int[] charCount) {
        int[] tempCount = new int[26];
        for (char c : word.toCharArray()) {
            tempCount[c - 'a']++;
            if (tempCount[c - 'a'] > charCount[c - 'a']) {
                return false;
            }
        }
        return true;
    }
}