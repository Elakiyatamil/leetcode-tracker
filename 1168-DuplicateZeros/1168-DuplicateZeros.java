// Last updated: 09/07/2026, 09:48:18
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Step 1: Count zeros
        for (int num : arr) {
            if (num == 0) zeros++;
        }

        // Step 2: Work backwards to avoid overwriting
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                if (i + zeros < n) arr[i + zeros] = 0;
                zeros--;
                if (i + zeros < n) arr[i + zeros] = 0;
            } else {
                if (i + zeros < n) arr[i + zeros] = arr[i];
            }
        }
    }
}
