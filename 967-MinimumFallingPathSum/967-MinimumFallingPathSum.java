// Last updated: 09/07/2026, 09:48:54
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        // Bottom-up DP
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int best = matrix[i + 1][j]; // directly below
                if (j > 0) best = Math.min(best, matrix[i + 1][j - 1]); // bottom-left
                if (j < n - 1) best = Math.min(best, matrix[i + 1][j + 1]); // bottom-right
                matrix[i][j] += best;
            }
        }

        // Minimum in the first row
        int ans = Integer.MAX_VALUE;
        for (int val : matrix[0]) {
            ans = Math.min(ans, val);
        }
        return ans;
    }
}
