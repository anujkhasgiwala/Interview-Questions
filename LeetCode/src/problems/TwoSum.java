package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffIndex = new HashMap<>();
        int index1 = 0, index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (diffIndex.containsKey(target - nums[i])) {
                index1 = diffIndex.get(target - nums[i]);
                index2 = i;
                break;
            } else {
                diffIndex.put(target - nums[i], i);
            }
        }
        return new int[] {index1, index2};
    }
}
