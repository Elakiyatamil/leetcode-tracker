// Last updated: 09/07/2026, 09:49:06
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        for (int a : aliceSizes) {
            aliceSum += a;
        }
        Set<Integer> bobSet = new HashSet<>();
        for (int b : bobSizes) {
            bobSum += b;
            bobSet.add(b);
        }
        int diff = (aliceSum - bobSum) / 2;
        for (int a : aliceSizes) {
            int b = a - diff;
            if (bobSet.contains(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{};
    }
}