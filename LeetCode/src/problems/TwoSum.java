package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remain = new HashMap();
        int indexes[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(remain.containsKey(nums[i])) {
                indexes[0] = remain.get(nums[i]);
                indexes[1] = i;
                break;
            }

            remain.put(diff, i);
        }

        return indexes;
    }
}
