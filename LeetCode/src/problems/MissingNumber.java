package problems;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int total = (nums.length * (nums.length + 1))/2;
        int sum = 0;
        for (int num : nums) {
			sum += num;
		}

        int missing = total - sum;

        return missing;
    }
}
