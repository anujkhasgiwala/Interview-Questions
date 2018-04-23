package stacksAndQueue;

import java.util.Stack;

public class StackMin {
	
	Stack<Integer> stackMin;
	Integer min = Integer.MAX_VALUE;

	public StackMin() {
		stackMin = new Stack<Integer>();
	}

	void push(Integer value) {
		if(stackMin.isEmpty()) {
			min = value;
			stackMin.push(value);
			return;
		}

		if(value < min) {
			stackMin.push(2*value - min);
			min = value;			
		} else
			stackMin.push(value);
	}

	Integer pop() {
		if(stackMin.isEmpty()) {
			System.out.println("Stack is empty!!");
			return min;
		}

		Integer top = stackMin.pop();
		if (top < min) {
			min = 2*min - top;
		}

		return top;
	}

	void peek() {
		if(stackMin.isEmpty()) {
			System.out.println("Stack is empty!!");
		}

		Integer top = stackMin.pop();
		if (top < min) {
			System.out.println(top);
		}
	}

	Integer min() {
		if(stackMin.isEmpty())
			System.out.println("Stack is empty!!");
		return min;
	}

	public static void main(String[] args) {
		
	}	
}