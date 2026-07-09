// Last updated: 09/07/2026, 09:50:46
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // 1. Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 2. Store only characters (keys)
        List<Character> list = new ArrayList<>(map.keySet());

        // 3. Sort characters by frequency
        list.sort((a, b) -> map.get(b) - map.get(a));
        //can also be written as  list.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));

        // 4. Build answer
        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            int freq = map.get(ch);
            for (int i = 0; i < freq; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
