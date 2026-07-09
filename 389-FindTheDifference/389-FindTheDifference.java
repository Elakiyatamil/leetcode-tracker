// Last updated: 09/07/2026, 09:51:30
class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;

        for (char c : s.toCharArray()) {
            res ^= c;
        }

        for (char c : t.toCharArray()) {
            res ^= c;
        }

        return res;
    }
}