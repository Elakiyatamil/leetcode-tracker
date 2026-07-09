// Last updated: 09/07/2026, 09:49:41
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // convert to lowercase
            }

            result.append(ch);
        }

        return result.toString();
    }
}