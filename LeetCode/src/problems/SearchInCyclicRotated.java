package problems;

public class SearchInCyclicRotated {
    public static int search(int[] nums, int target) {
        if(nums == null || nums.length < 1) {
            return -1;
        }

        int left = 0, right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                if(nums[left] <= nums[mid] && nums[left] > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if(nums[mid] <= nums[right] && target > nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        System.out.print(search(nums, target));
    }
}
