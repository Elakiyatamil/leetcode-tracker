// Last updated: 09/07/2026, 09:49:05
class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];
                if (v > 0) {
                    // Each cube contributes 6 faces, but stacked cubes overlap
                    area += 6 * v - 2 * (v - 1);

                    // Subtract overlap with top neighbor
                    if (i > 0) {
                        area -= 2 * Math.min(v, grid[i - 1][j]);
                    }
                    // Subtract overlap with left neighbor
                    if (j > 0) {
                        area -= 2 * Math.min(v, grid[i][j - 1]);
                    }
                }
            }
        }
        return area;
    }
}
