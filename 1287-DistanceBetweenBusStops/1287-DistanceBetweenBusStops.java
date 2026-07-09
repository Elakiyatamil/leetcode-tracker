// Last updated: 09/07/2026, 09:47:44
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int total = 0, clockwise = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (i >= start && i < destination) {
                clockwise += distance[i];
            }
        }

        int counterClockwise = total - clockwise;
        return Math.min(clockwise, counterClockwise);
    }
}
