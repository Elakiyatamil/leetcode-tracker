// Last updated: 09/07/2026, 09:46:56
class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int countA = 0, countB = 0;
        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) countA++;
        }
        for (int i = mid; i < n; i++) {
            if (isVowel(s.charAt(i))) countB++;
        }

        return countA == countB;
    }
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}