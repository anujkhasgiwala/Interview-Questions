package problems;

public class TrappingRainWater {
	public int trap(int[] height) {
		int left = 0, right = height.length - 1, total = 0, left_max = 0, right_max = 0;
		
		while(left < right) {
			if(height[left] < height[right]) {
				if(height[left] >= left_max)
					left_max = height[left];
				else
					total = left_max - height[left];
				left++;
			} else {
				if(height[right] >= right_max)
					right_max = height[right];
				else
					total = right_max - height[right];
				right++;
			}
		}
		
        return total;
    }
}
