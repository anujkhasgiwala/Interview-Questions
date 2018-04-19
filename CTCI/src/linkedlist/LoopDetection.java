package linkedlist;

public class LoopDetection {
	 class Node {
	        int data;
	        Node next;
	        Node(int d) {data = d; next = null; }
	}
	public static void main(String[] args) {
		
	}
	
	static void detectLoop(Node head) {
		Node slow=head, fast=head;
		while(fast!=null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("Loop found");
				return;
			}
		}
	}
}
