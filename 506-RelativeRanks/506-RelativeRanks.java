// Last updated: 09/07/2026, 09:50:29
import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        
        // store index positions
        Integer[] idx = new Integer[n];
        for(int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // sort indices based on score (descending)
        Arrays.sort(idx, (a, b) -> score[b] - score[a]);

        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                result[idx[i]] = "Gold Medal";
            } else if(i == 1) {
                result[idx[i]] = "Silver Medal";
            } else if(i == 2) {
                result[idx[i]] = "Bronze Medal";
            } else {
                result[idx[i]] = String.valueOf(i + 1);
            }
        }

        return result;
    }
}