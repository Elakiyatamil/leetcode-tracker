// Last updated: 09/07/2026, 09:52:39
class Solution
 {
    public boolean isHappy(int n) 
    {
      int rem = 0;
      if(n==1)
      {
        return true;
      }
      HashMap<Integer,Boolean> map = new HashMap<>();
      while(n!=1)
      {
        if(map.containsKey(n))
        {
            return false;
        }
        map.put(n,true);
        int sum=0;
        while(n!=0)
        {
            rem = n%10;
            sum += rem * rem;
            n=n/10;
        }
       n=sum;
        }
        return true;
      }
    }
