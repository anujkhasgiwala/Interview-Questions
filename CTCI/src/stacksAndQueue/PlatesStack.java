package stacksAndQueue;

import java.util.*;

public class PlatesStack {
	List<Stack<Integer>> stackOfPlates = new ArrayList<Stack<Integer>>();
	int capacity = 5;

	void push(int value) {
		if(stackOfPlates.get(stackOfPlates.size() - 1) != null && stackOfPlates.get(stackOfPlates.size() - 1).size()<=capacity)
			stackOfPlates.get(stackOfPlates.size() - 1).push(value);
		else {
			Stack s = new Stack();
			s.push(value);
			stackOfPlates.add(s);
		}
	}

	void pop() {
		if(stackOfPlates.get(stackOfPlates.size() - 1) != null) {
			stackOfPlates.get(stackOfPlates.size() - 1).pop();
			if(stackOfPlates.get(stackOfPlates.size() - 1).size() == 0)
				stackOfPlates.remove(stackOfPlates.size() - 1);
		}
	}

	void popAt(int stackIndex) {
		Stack s = stackOfPlates.get(stackIndex);
		s.pop();
		if(s.isEmpty())
			stackOfPlates.remove(stackIndex);
	}
}