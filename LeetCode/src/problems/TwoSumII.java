package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> diffIndex = new HashMap<>();
        int index1 = 0, index2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (diffIndex.containsKey(numbers[i])) {
                index1 = diffIndex.get(numbers[i]);
                index2 = i + 1;
                break;
            } else {
                diffIndex.put(target - numbers[i], i + 1);
            }
        }
        return new int[] {index1, index2};
    }

    public static void main(String[] args) {
        int nums[] = new int[]{2,7,11,15};
        new TwoSumII().twoSum(nums, 9);
    }
}
