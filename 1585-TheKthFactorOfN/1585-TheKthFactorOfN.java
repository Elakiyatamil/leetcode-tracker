// Last updated: 09/07/2026, 09:47:16
class Solution {
    public int kthFactor(int n, int k) 
    {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
           if(n%i==0)
           {
             list.add(i);
           }
        }
        return k <= list.size() ? list.get(k - 1) : -1;
    }
}