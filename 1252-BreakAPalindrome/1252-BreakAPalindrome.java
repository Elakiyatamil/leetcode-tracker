// Last updated: 09/07/2026, 09:48:04
class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();

        // Case 1
        if (n == 1) return "";

        char[] arr = palindrome.toCharArray();

        // Case 2: Try to replace first non-'a' in first half
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return new String(arr);
            }
        }

        // Case 3: All 'a'
        arr[n - 1] = 'b';
        return new String(arr);
    }
}