// Last updated: 09/07/2026, 09:50:53
class Solution {
    public int countSegments(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // start of a new segment
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }
}