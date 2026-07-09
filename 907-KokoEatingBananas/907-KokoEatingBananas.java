// Last updated: 09/07/2026, 09:49:10
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // Find maximum pile
        for (int p : piles) {
            high = Math.max(high, p);
        }

        // Binary search
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                high = mid;       // try slower speed
            } else {
                low = mid + 1;    // need faster speed
            }
        }
        return low;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        long hours = 0;

        for (int p : piles) {
            hours += (p + k - 1) / k;  // ceiling division
            if (hours > h) return false;
        }
        return true;
    }
}
