// Last updated: 09/07/2026, 09:47:34
class Solution {
    public int balancedStringSplit(String s) {
         int count = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'R') balance++;
            else balance--;

            if (balance == 0) count++;
        }

        return count;
    }
}