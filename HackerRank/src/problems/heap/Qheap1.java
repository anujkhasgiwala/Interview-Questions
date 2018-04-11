package problems.heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Qheap1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		Queue heap = new PriorityQueue<Integer>();

		String line; int l = 0;
		while (l < n) {
			line = br.readLine();
			if(line.split(" ")[0].equals("1"))
				heap.add(Integer.parseInt(line.split(" ")[1].trim()));
			else if(line.split(" ")[0].equals("2"))
				heap.remove(Integer.parseInt(line.split(" ")[1]));
			else {
				System.out.println(heap.peek());
			}
			l++;
		}
	}
}