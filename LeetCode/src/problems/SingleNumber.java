package problems;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int singleNumber = 0, i = 0, len = nums.length;

        while(i < len) {
        	singleNumber ^= nums[i];
        	i++;
        }

        return singleNumber;
    }
}
