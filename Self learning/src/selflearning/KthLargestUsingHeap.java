package selflearning;

import java.util.PriorityQueue;

public class KthLargestUsingHeap {
	int kthLargest(int nums[], int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
		
		for(int num: nums) {
			queue.add(num);
			
			if(queue.size() > k)
				queue.poll();
		}
		
		return queue.peek();
	}
	
	public static void main(String[] args) {
		int nums[] = {10, 324, 45, 90, 9808};
		new KthLargestUsingHeap().kthLargest(nums, 2);
	}
}
