// Last updated: 09/07/2026, 09:49:37
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] need = new int[26];

        // Count letters from licensePlate
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                need[Character.toLowerCase(c) - 'a']++;
            }
        }

        String result = null;

        for (String word : words) {
            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            boolean valid = true;
            for (int i = 0; i < 26; i++) {
                if (count[i] < need[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
}