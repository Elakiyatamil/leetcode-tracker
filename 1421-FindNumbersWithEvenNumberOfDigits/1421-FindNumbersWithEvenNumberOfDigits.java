// Last updated: 09/07/2026, 09:47:29
class Solution {
        public int Digits(int n)
        {
            if(n<0)
            {
                n = -n;
            }
           else if( n==0)
           {
                return 1 ;
           }
           int count = 0;
           while (n> 0)
           { 
             n/=10;
              count++;
           }
           return count;
        }
        public int findNumbers(int[] nums) 
    {
        int count = 0;
        for(int num : nums)
        {
           int numberOfDigits = Digits(num);
           {
            if(numberOfDigits % 2==0)
            {
               count++;
            }
           }
        }
        return count;
    }
}