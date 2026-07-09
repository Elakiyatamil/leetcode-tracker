// Last updated: 09/07/2026, 09:48:12
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001]; // since max value = 1000
        // Count frequency of elements in arr1
        for (int num : arr1) {
            freq[num]++;
        }
        int i = 0;
        // Place elements as per arr2 order
        for (int num : arr2) {
            while (freq[num] > 0) {
                arr1[i++] = num;
                freq[num]--;
            }
        }
        // Place remaining elements in ascending order
        for (int num = 0; num <= 1000; num++) {
            while (freq[num] > 0) {
                arr1[i++] = num;
                freq[num]--;
            }
        }
        return arr1;
    }
}