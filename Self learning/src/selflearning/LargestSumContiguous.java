package selflearning;

public class LargestSumContiguous {
	int maxSubArraySum(int nums[]) {
		int max = Integer.MIN_VALUE, maxNow = 0;
		
		for(int i = 0; i < nums.length; i++) {
			maxNow += nums[i];
			
			if(maxNow < 0)
				maxNow = 0;
			if(max < maxNow)
				max = maxNow;
		}

		return max;
	}
}
