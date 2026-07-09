// Last updated: 09/07/2026, 09:46:04
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // Flip vertically: swap row x+i with row x+k-1-i
        for (int i = 0; i < k / 2; i++) {
            int[] rowTop = grid[x + i];
            int[] rowBottom = grid[x + k - 1 - i];
            for (int j = 0; j < k; j++) {
                int temp = rowTop[y + j];
                rowTop[y + j] = rowBottom[y + j];
                rowBottom[y + j] = temp;
            }
        }
        return grid;
    }
}