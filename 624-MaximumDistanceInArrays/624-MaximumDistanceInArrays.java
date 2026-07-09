// Last updated: 09/07/2026, 09:49:57
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int result = 0;

        // Initialize first array's first & last values
        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);

        // Iterate from 2nd array onward
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> arr = arrays.get(i);

            int currentMin = arr.get(0);                        // first element
            int currentMax = arr.get(arr.size() - 1);           // last element

            // Compare with previous arrays (this is the maxDistance logic)
            result = Math.max(result, Math.abs(currentMax - globalMin));
            result = Math.max(result, Math.abs(globalMax - currentMin));

            // Update globalMin & globalMax for next iterations
            globalMin = Math.min(globalMin, currentMin);
            globalMax = Math.max(globalMax, currentMax);
        }

        return result;
    }
}
