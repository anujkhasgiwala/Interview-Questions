package problems;

public class HouseRobber {
	public int rob(int[] nums) {
        int rob = 0, notRob = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	int curr = notRob + nums[i];
        	notRob = Math.max(rob, notRob);
        	rob = curr;
        }
        
        return Math.max(rob, notRob);
    }
}
