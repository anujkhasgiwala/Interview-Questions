package test;

public class Queue {
	int front, rear, capacity;
	int q[];
	
	public Queue(int capacity) {
		front = 0;
		rear = 0;
		this.capacity = capacity;
		q = new int[capacity];
	}
	
	public void enqueue(int elem) {
		if(rear == capacity)
			return;
		
		rear = (rear + 1) % capacity;
		q[rear] = elem;
	}
	
	public int deque() {
		if(front == rear)
			return Integer.MIN_VALUE;
		
		int temp = q[front];
		front = (front + 1) % capacity;
		return temp;			
	}
}
