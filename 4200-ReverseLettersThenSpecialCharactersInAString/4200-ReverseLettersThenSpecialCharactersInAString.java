// Last updated: 09/07/2026, 09:46:10
class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        // Collect letters and specials separately
        StringBuilder letters = new StringBuilder();
        StringBuilder specials = new StringBuilder();
        for (char c : arr) {
            if (Character.isLowerCase(c)) {
                letters.append(c);
            } else {
                specials.append(c);
            }
        }
        // Reverse both groups
        letters.reverse();
        specials.reverse();
        // Rebuild the string
        int li = 0, si = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(arr[i])) {
                arr[i] = letters.charAt(li++);
            } else {
                arr[i] = specials.charAt(si++);
            }
        }
        return new String(arr);
    }
}