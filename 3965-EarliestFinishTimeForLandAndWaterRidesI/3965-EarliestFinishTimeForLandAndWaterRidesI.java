// Last updated: 09/07/2026, 09:46:07
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        // Try all land rides with all water rides
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                // Case 1: Land ride first, then water ride
                int landFinish = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int waterFinish = waterStart + waterDuration[j];
                ans = Math.min(ans, waterFinish);

                // Case 2: Water ride first, then land ride
                int waterFinish2 = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterFinish2, landStartTime[i]);
                int landFinish2 = landStart + landDuration[i];
                ans = Math.min(ans, landFinish2);
            }
        }
        return ans;
    }
}