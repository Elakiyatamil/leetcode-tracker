// Last updated: 09/07/2026, 09:51:22
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        
        int length = 0;
        boolean oddFound = false;
        
        for(int count : freq){
            if(count % 2 == 0){
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }
        
        if(oddFound) length += 1;
        
        return length;
    }
}