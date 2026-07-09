// Last updated: 09/07/2026, 09:50:24
class Solution {
    public boolean detectCapitalUse(String word) 
    {
        if (word.equals(word.toUpperCase())) return true; // Case 1: all uppercase
        if (word.equals(word.toLowerCase())) return true;  // Case 2: all lowercase
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) 
        {
            return true; // Case 3: First letter uppercase, rest lowercase
        }
        return false;
    }
}