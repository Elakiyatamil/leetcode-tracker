// Last updated: 09/07/2026, 09:51:23
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        // convert to unsigned 32-bit value
        long n = num < 0 ? (long) num + (1L << 32) : num;

        char[] hex = {
            '0','1','2','3','4','5','6','7',
            '8','9','a','b','c','d','e','f'
        };

        String result = "";

        while (n > 0) {
            int rem = (int)(n % 16);
            result = hex[rem] + result;

            // using parseInt as requested
            n = Integer.parseInt(String.valueOf(n / 16));
        }

        return result;
    }
}