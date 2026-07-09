// Last updated: 09/07/2026, 09:48:28
class Solution {
    public int numRookCaptures(char[][] board) {
        int rookRow = -1, rookCol = -1;

        // Step 1: Find the rook
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
        }

        int captures = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}}; // down, up, right, left

        // Step 2: Explore in each direction
        for (int[] d : dirs) {
            int x = rookRow, y = rookCol;
            while (true) {
                x += d[0];
                y += d[1];
                if (x < 0 || x >= 8 || y < 0 || y >= 8) break; // edge of board
                if (board[x][y] == 'B') break; // blocked by bishop
                if (board[x][y] == 'p') {
                    captures++;
                    break; // pawn captured, stop in this direction
                }
            }
        }

        return captures;
    }
}
