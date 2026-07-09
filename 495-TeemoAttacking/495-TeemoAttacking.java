// Last updated: 09/07/2026, 09:50:32
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            total += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        return total + duration;
    }
}