package problems;

public class SearchRange {
    //TODO perform 2 binary search
    public static int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        int start = 0, end = nums.length - 1, index = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(nums[mid] == target) {
                index = mid;
                break;
            }

            if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if(index != -1) {
            int left = index, right = index;
            while(left > 0 && nums[left - 1] == target) {
                left--;
            }
            while(right < nums.length - 1 && nums[right + 1] == target) {
                right++;
            }
            range[0] = left;
            range[1] = right;
        } else {
            range[0] = range[1] = index;
        }

        return range;
    }

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        searchRange(nums, 8);
    }
}
