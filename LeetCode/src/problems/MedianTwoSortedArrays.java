package problems;

public class MedianTwoSortedArrays {

    public static void main(String[] args) {
        int nums1[] = {1, 3}, nums2[] = {2,4};
        new MedianTwoSortedArrays().findMedianSortedArrays(nums1, nums2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length, length2 = nums2.length;

        if(length1 == 0 && length2 == 1) {
            return nums2[0];
        } else if (length1 == 1 && length2 == 0) {
            return nums1[0];
        }

        int length = length1 + length2;
        int nums[] = new int[length];
        int pointer1 = 0, pointer2 = 0, i = 0;

        while(pointer1 < length1 && pointer2 < length2) {
            if(nums1[pointer1] < nums2[pointer2]) {
                nums[i++] = nums1[pointer1++];
            } else {
                nums[i++] = nums2[pointer2++];
            }
        }

        while(pointer1 < length1) {
            nums[i++] = nums1[pointer1++];
        }
        while(pointer2 < length2) {
            nums[i++] = nums2[pointer2++];
        }

        if (length % 2 != 0) {
            return nums[length / 2];
        } else {
            return (double) (nums[length / 2] + nums[length / 2 + 1]) / 2;
        }
    }
}
