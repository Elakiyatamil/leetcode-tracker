// Last updated: 09/07/2026, 09:48:29
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1]; // index from 1 to n

        for (int[] t : trust) {
            int a = t[0], b = t[1];
            score[a]--; // a trusts someone → not judge
            score[b]++; // b is trusted → potential judge
        }

        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) return i; // trusted by everyone else, trusts nobody
        }
        return -1;
    }
}
