package selflearning;

import java.util.PriorityQueue;

public class KLargestUsingHeap {
	void kLargest(int nums[], int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(k);
		
		for(int num : nums) {
			queue.add(num);
			
			if(queue.size() > k)
				queue.poll();
		}
		
		//print queue;
	}
}
