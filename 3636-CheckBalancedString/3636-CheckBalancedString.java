// Last updated: 09/07/2026, 09:46:03
class Solution 
{
    public boolean isBalanced(String num) 
    {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';  // convert char to integer

            if (i % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
        }

        return evenSum == oddSum;
    }
}