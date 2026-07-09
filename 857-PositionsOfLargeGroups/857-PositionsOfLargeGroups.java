// Last updated: 09/07/2026, 09:49:19
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        
        int start = 0; // start index of current group
        
        for (int i = 1; i <= s.length(); i++) {
            // if end reached OR character changes
            if (i == s.length() || s.charAt(i) != s.charAt(start)) {
                
                if (i - start >= 3) {
                    result.add(Arrays.asList(start, i - 1));
                }
                
                start = i; // move to next group
            }
        }
        
        return result;
    }
}