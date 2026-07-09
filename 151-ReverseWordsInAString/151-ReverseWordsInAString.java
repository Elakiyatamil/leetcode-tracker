// Last updated: 09/07/2026, 09:53:00
class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
}