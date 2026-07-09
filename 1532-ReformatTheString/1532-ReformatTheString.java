// Last updated: 09/07/2026, 09:47:18
class Solution {
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        
        // Step 1: Split letters and digits
        for (char c : s.toCharArray()) 
        {
            if (Character.isDigit(c)) 
            {
                digits.append(c);
            } 
            else 
            {
                letters.append(c);
            }
        }
        
        int n1 = letters.length();
        int n2 = digits.length();
        
        // Step 2: If not possible
        if (Math.abs(n1 - n2) > 1) return "";
        
        // Step 3: Decide who starts first
        boolean letterTurn = n1 > n2;
        
        // Step 4: Merge alternately
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < n1 || j < n2) 
        {
            if (letterTurn && i < n1) 
            {
                result.append(letters.charAt(i++));
            } 
            else if (!letterTurn && j < n2) 
            {
                result.append(digits.charAt(j++));
            }
            letterTurn = !letterTurn; // switch turn
        }
        
        return result.toString();
    }
}
