// Last updated: 09/07/2026, 09:46:39
class Solution {
    public int minFlips(String s) {

        int n = s.length();
        String str = s + s;

        int diff1 = 0, diff2 = 0;
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < str.length(); i++){

            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if(str.charAt(i) != expected1) diff1++;
            if(str.charAt(i) != expected2) diff2++;

            if(i >= n){
                char prev = str.charAt(i - n);

                char prevExp1 = ((i-n) % 2 == 0) ? '0' : '1';
                char prevExp2 = ((i-n) % 2 == 0) ? '1' : '0';

                if(prev != prevExp1) diff1--;
                if(prev != prevExp2) diff2--;
            }

            if(i >= n-1){
                res = Math.min(res, Math.min(diff1, diff2));
            }
        }

        return res;
    }
}