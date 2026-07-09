// Last updated: 09/07/2026, 09:49:17
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        
        for (int[] row : image) {
            int left = 0, right = n - 1;
            while (left <= right) {
                // Flip horizontally by swapping
                int temp = row[left] ^ 1;   // invert while swapping
                row[left] = row[right] ^ 1; // invert while swapping
                row[right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }
}
