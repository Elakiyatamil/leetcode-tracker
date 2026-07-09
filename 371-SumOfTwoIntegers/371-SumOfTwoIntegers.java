// Last updated: 09/07/2026, 09:51:41
class Solution 
{
    public int getSum(int a, int b) 
    {
       while (b != 0) 
       {
            int carry = (a & b) << 1; // carry
            a = a ^ b;                // sum without carry
            b = carry;                // carry added in next step
        }
        return a; 
    }
}