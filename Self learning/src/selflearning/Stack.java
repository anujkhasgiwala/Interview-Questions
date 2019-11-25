package selflearning;

public class Stack {
	int top, capacity;
	int s[];
	
	Stack(int capacity) {
		top = -1;
		this.capacity = capacity;
		s = new int[capacity];
	}
	
	public void push(int elem) {
		if (top == capacity)
			return;
		
		s[++top] = elem;
	}
	
	public int pop() {
		if(top == -1)
			return Integer.MIN_VALUE;
		
		int temp = s[top];
		top --;
		
		return temp;
	}
}
