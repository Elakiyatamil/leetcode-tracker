// Last updated: 09/07/2026, 09:49:22
import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        // Step 1: Normalize paragraph
        paragraph = paragraph.toLowerCase();
        
        // Replace non-letter characters with space
        paragraph = paragraph.replaceAll("[^a-z]", " ");
        
        // Step 2: Store banned words in set
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // Step 3: Count word frequencies
        Map<String, Integer> map = new HashMap<>();
        
        String[] words = paragraph.split("\\s+");
        
        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        // Step 4: Find most frequent word
        String result = "";
        int max = 0;
        
        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                result = word;
            }
        }
        
        return result;
    }
}