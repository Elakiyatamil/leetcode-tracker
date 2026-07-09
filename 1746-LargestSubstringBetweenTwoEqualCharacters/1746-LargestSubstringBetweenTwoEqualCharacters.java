// Last updated: 09/07/2026, 09:46:59
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1);
        int maxLen = -1;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (firstIndex[c] == -1) {
                // First time seeing this character
                firstIndex[c] = i;
            } else {
                // Already seen, compute length between
                maxLen = Math.max(maxLen, i - firstIndex[c] - 1);
            }
        }
        return maxLen;
    }
}