// Last updated: 09/07/2026, 09:48:53
import java.util.*;

class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> res = construct(n);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = res.get(i);
        return ans;
    }

    private List<Integer> construct(int n) {
        if (n == 1) return Arrays.asList(1);

        List<Integer> odd = construct((n + 1) / 2);
        List<Integer> even = construct(n / 2);

        List<Integer> res = new ArrayList<>();
        for (int x : odd) res.add(2 * x - 1); // odd positions
        for (int x : even) res.add(2 * x);    // even positions
        return res;
    }
}
