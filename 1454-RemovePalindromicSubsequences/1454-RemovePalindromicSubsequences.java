// Last updated: 09/07/2026, 09:47:26
class Solution {
    public int removePalindromeSub(String s) {
         // Check if palindrome
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2;
            }
            left++;
            right--;
        }

        return 1;
    }
}