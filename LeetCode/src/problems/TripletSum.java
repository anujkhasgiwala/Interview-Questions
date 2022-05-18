package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1, right = nums.length - 1, target = -nums[i];
            while(left < right) {
                if(nums[left] + nums[right] == target) {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return triplets;
    }
}
