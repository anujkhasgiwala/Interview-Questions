package problems;

import java.util.Arrays;

public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length] = nums[i];
                length ++;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        new RemoveElements().removeElement(nums, val);
    }
}
