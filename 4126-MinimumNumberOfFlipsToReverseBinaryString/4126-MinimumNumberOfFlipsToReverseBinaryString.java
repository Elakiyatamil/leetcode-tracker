// Last updated: 09/07/2026, 09:46:06
class Solution {
    public int minimumFlips(int n) {
       String s = Integer.toBinaryString(n);
        int left = 0, right = s.length() - 1;
        int flips = 0;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Both bits must be flipped to match
                flips += 2;
            }
            left++;
            right--;
        }
        return flips; 
    }
}