// Last updated: 09/07/2026, 09:46:43
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);
    }
    private int getValue(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(c - 'a'); // map 'a'->0, 'b'->1, ..., 'j'->9
        }
        return Integer.parseInt(sb.toString());
    }
}
