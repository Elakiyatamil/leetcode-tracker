// Last updated: 09/07/2026, 09:48:50
import java.util.*;

class Solution {
    int n;
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    
    public int shortestBridge(int[][] grid) {
        n = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        boolean found = false;
        
        // Step 1: Find the first island and mark it
        for (int i = 0; i < n; i++) {
            if (found) break;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, queue);
                    found = true;
                    break;
                }
            }
        }
        
        // Step 2: BFS expansion from the first island
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] cell = queue.poll();
                for (int[] d : dirs) {
                    int x = cell[0] + d[0];
                    int y = cell[1] + d[1];
                    if (x >= 0 && x < n && y >= 0 && y < n) {
                        if (grid[x][y] == 1) {
                            return steps; // reached second island
                        }
                        if (grid[x][y] == 0) {
                            grid[x][y] = -1; // mark visited water
                            queue.offer(new int[]{x, y});
                        }
                    }
                }
            }
            steps++;
        }
        return -1; // should not happen
    }
    
    private void dfs(int[][] grid, int i, int j, Queue<int[]> queue) {
        if (i < 0 || j < 0 || i >= n || j >= n || grid[i][j] != 1) return;
        grid[i][j] = -1; // mark visited island
        queue.offer(new int[]{i, j});
        for (int[] d : dirs) {
            dfs(grid, i + d[0], j + d[1], queue);
        }
    }
}
