package problems;

public class FirstMissingPositiveInteger {
    public static int firstMissingPositive(int[] nums) {
        int len = nums.length, i = 0;

        while(i < len) {
            if(nums[i] >= 1 && nums[i] <= len && nums[nums[i]-1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        int j = 0;
        while(j < len && nums[j] - 1 == j) j++;
        return j+1;
    }

    private static void swap(int[] nums, int j, int k) {
        int temp = nums[j];
        nums[j]= nums[k];
        nums[k] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(firstMissingPositive(nums));
    }
}
