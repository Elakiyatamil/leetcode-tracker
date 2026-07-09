// Last updated: 09/07/2026, 09:48:16
import java.util.*;

class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int n = values.length;
        int[][] items = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            items[i][0] = values[i]; // value
            items[i][1] = labels[i]; // label
        }
        
        Arrays.sort(items, (a, b) -> b[0] - a[0]); // sort by value descending
        
        Map<Integer, Integer> labelCount = new HashMap<>();
        int sum = 0, chosen = 0;
        
        for (int[] item : items) {
            int value = item[0], label = item[1];
            if (labelCount.getOrDefault(label, 0) < useLimit) {
                sum += value;
                labelCount.put(label, labelCount.getOrDefault(label, 0) + 1);
                chosen++;
                if (chosen == numWanted) break;
            }
        }
        
        return sum;
    }
}
