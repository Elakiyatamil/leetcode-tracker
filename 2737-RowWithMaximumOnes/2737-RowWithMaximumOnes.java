// Last updated: 09/07/2026, 09:46:26
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
       int maxCount = 0;
       int rowIndex = 0;
       int m = mat.length;
       int n = mat[0].length;
       for (int i = 0; i < m; i++) 
       {
        int count = 0;
        for (int j = 0; j < n; j++) 
        {
            if (mat[i][j] == 1) 
            count++;
        }
        if (count > maxCount) 
        {
          maxCount = count;
          rowIndex = i;
        }
      }
      return new int[]{rowIndex,maxCount};
   }
}