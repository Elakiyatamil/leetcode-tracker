// Last updated: 09/07/2026, 09:53:30
import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int start, int[] nums, List<Integer> curArr, List<List<Integer>> result) 
    {
        result.add(new ArrayList<>(curArr));
        for (int i = start; i < nums.length; i++) 
        {
            if(i > start && nums[i] == nums[i-1]) continue;
            curArr.add(nums[i]);
            backtrack(i + 1, nums, curArr, result);
            curArr.remove(curArr.size() - 1);
        }
    }
}