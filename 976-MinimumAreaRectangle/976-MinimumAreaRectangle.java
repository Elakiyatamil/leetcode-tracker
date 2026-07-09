// Last updated: 09/07/2026, 09:48:48
import java.util.*;

class Solution {
    public int minAreaRect(int[][] points) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] p : points) {
            map.computeIfAbsent(p[0], k -> new HashSet<>()).add(p[1]);
        }

        int minArea = Integer.MAX_VALUE;
        List<Integer> xs = new ArrayList<>(map.keySet());

        for (int i = 0; i < xs.size(); i++) {
            for (int j = i + 1; j < xs.size(); j++) {
                int x1 = xs.get(i), x2 = xs.get(j);
                Set<Integer> set1 = map.get(x1);
                Set<Integer> set2 = map.get(x2);

                // Find common y’s
                List<Integer> common = new ArrayList<>();
                for (int y : set1) {
                    if (set2.contains(y)) {
                        common.add(y);
                    }
                }

                // If at least 2 common y’s, we can form rectangles
                Collections.sort(common);
                for (int k = 1; k < common.size(); k++) {
                    int area = Math.abs(x2 - x1) * (common.get(k) - common.get(k - 1));
                    minArea = Math.min(minArea, area);
                }
            }
        }

        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }
}
