package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> elementGreaterMap = new HashMap();
        Stack<Integer> nums2Stack = new Stack<>();

        for(int i = 0; i < nums2.length; i++) {
            while(!nums2Stack.isEmpty() && nums2Stack.peek() < nums2[i]) {
                elementGreaterMap.put(nums2Stack.pop(), nums2[i]);
            }

            nums2Stack.push(nums2[i]);
        }

        int ans[] = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            ans[i] = elementGreaterMap.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}
