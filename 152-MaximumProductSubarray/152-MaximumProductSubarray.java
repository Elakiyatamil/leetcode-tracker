// Last updated: 09/07/2026, 09:52:58
class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            
            int tempMax = Math.max(current, Math.max(current * maxProd, current * minProd));
            int tempMin = Math.min(current, Math.min(current * maxProd, current * minProd));
            
            maxProd = tempMax;
            minProd = tempMin;
            
            result = Math.max(result, maxProd);
        }
        
        return result;
    }
}
