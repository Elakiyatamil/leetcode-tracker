// Last updated: 09/07/2026, 09:48:21
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if valid pattern exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}