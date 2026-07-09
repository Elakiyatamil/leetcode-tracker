// Last updated: 09/07/2026, 09:46:57
class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int max = Integer.MIN_VALUE;
        for(int[] i : accounts)
        {
           int sum =0;
            for(int j : i)
            {
                sum += j;
            }
            if(sum > max)
            {
              max = sum ;
            }
        }
        return max;
    }
}