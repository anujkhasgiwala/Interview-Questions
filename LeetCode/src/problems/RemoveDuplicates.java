package problems;

public class RemoveDuplicates {
	static public int removeDuplicates(int[] nums) {
		int i = 0;
		if(nums.length > 0) 
			i= 1;

		for(int num : nums) {
			 if (num > nums[i-1])
		            nums[i++] = num;
		}

        return i;
    }

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(nums);
	}
}
