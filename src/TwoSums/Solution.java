package TwoSums;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Complemento = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer ComplementoI  = Complemento.get(nums[i]);
            if (ComplementoI != null) {
                return new int[]{i,ComplementoI};
            }
            Complemento.put(target - nums[i], i);
        }
        return nums;

    }
}
