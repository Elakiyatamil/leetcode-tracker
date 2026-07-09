// Last updated: 09/07/2026, 09:50:05
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for (int candy : candyType) {
            types.add(candy);
        }
        return Math.min(types.size(), candyType.length / 2);
    }
}