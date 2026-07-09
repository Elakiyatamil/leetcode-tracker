// Last updated: 09/07/2026, 09:46:54
class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isNice(sub) && sub.length() > res.length()) {
                    res = sub;
                }
            }
        }
        return res;
    }
    private boolean isNice(String str) {
        for (char c : str.toCharArray()) {
            if (!(str.contains(Character.toString(Character.toLowerCase(c))) &&
                  str.contains(Character.toString(Character.toUpperCase(c))))) {
                return false;
            }
        }
        return true;
    }
}