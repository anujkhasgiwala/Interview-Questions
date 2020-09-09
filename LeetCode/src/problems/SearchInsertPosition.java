package problems;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;

        while (start <= end) {
            mid = start + (end - 1) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        mid = start + 1;
        return mid;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6}, target=2 ;
        SearchInsertPosition.searchInsert(nums, target);
    }
}
