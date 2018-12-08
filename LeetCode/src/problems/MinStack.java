package problems;

import java.util.Stack;

public class MinStack {
	
	class MinStackUsing1Stack { 
		int min;
		Stack<Integer> stack;
		
		MinStackUsing1Stack() {
			stack = new Stack<>();
		}
		
		public void push(int element) {
			if(stack.isEmpty()) {
				stack.push(element);
				min = element;
			} else {
				stack.push(element - min);
				if(element < min)
					min = element;
			}
		}
		
		public void pop() {
			if (stack.isEmpty())
				return;
			int temp = stack.peek();
			
			if(temp < 0)
				min = min - temp;

			stack.pop();
		}
		
		public int getMin() {
			return min;
		}
	}
	
	class MinStackUsing2Stack { 
		Stack<Integer> stack, minStack;
		
		MinStackUsing2Stack() {
			stack = new Stack<>();
			minStack = new Stack<>();
		}
		
		public void push(int element) {
			stack.push(element);
			if(minStack.isEmpty() || minStack.peek() > element) {
				minStack.push(element);
			} else {
				minStack.push(minStack.peek());
			}
		}
		
		public void pop() {
			if (stack.isEmpty())
				return;
			minStack.pop();
			stack.pop();
		}
		
		public int getMin() {
			if(minStack.isEmpty())
				return 0;
			return minStack.peek();
		}

		public int top() {
			if(stack.isEmpty())
				return -1;
			return stack.peek();
		}
	}
}
