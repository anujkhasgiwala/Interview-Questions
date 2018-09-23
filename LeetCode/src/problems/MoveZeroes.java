package problems;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
        int i = 0, len = nums.length;
        
        for(int num : nums) {
        	if(num != 0) {
        		nums[i] = num;
        		i++;
        	}
        }
        
        while(i < len) {
        	nums[i++] = 0;
        }
    }
}
