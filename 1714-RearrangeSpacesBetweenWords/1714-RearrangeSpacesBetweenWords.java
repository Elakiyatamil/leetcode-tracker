// Last updated: 09/07/2026, 09:47:01
class Solution {
    public String reorderSpaces(String text) {
        int spaceCount = 0;

        // Count spaces
        for (char c : text.toCharArray()) {
            if (c == ' ') spaceCount++;
        }

        // Extract words
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;

        StringBuilder result = new StringBuilder();

        // If only one word
        if (wordCount == 1) {
            result.append(words[0]);
            for (int i = 0; i < spaceCount; i++) {
                result.append(" ");
            }
            return result.toString();
        }

        // Calculate spaces
        int spacesBetween = spaceCount / (wordCount - 1);
        int extraSpaces = spaceCount % (wordCount - 1);

        String gap = " ".repeat(spacesBetween);

        // Build result
        for (int i = 0; i < wordCount; i++) {
            result.append(words[i]);
            if (i != wordCount - 1) {
                result.append(gap);
            }
        }

        // Add extra spaces at end
        result.append(" ".repeat(extraSpaces));

        return result.toString();
    }
}