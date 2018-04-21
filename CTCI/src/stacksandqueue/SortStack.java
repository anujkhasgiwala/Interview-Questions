package stacksandqueue;

import java.util.*;

public class SortStack {
	static Stack<Integer> unsorted = new Stack<Integer>();
	static Stack<Integer> sorted = new Stack<Integer>();

	static void sort() {
		while(unsorted.size() > 0) {
			Integer tempElement = unsorted.pop();

			if(sorted.isEmpty())
				sorted.push(tempElement);
			else {
				if(tempElement < sorted.peek()) {
					while(tempElement < sorted.peek()) {
						unsorted.push(sorted.pop());
						sorted.push(tempElement);
					}
				} else
					sorted.push(tempElement);
			}
		}

		while(sorted.size() > 0) {
			unsorted.push(sorted.pop());
		}
		return;
	}

	public static void main(String[] args) {
		unsorted.push(7);
		unsorted.push(10);
		unsorted.push(5);

		sort();
	}
}