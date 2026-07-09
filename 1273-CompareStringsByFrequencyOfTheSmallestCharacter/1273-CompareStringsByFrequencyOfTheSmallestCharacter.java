// Last updated: 09/07/2026, 09:47:57
import java.util.*;

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] wordFreq = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordFreq[i] = f(words[i]);
        }
        Arrays.sort(wordFreq);

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int qFreq = f(queries[i]);
            // Binary search: find first wordFreq > qFreq
            int idx = upperBound(wordFreq, qFreq);
            result[i] = wordFreq.length - idx;
        }
        return result;
    }

    private int f(String s) {
        char minChar = 'z';
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c < minChar) {
                minChar = c;
                count = 1;
            } else if (c == minChar) {
                count++;
            }
        }
        return count;
    }

    private int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
