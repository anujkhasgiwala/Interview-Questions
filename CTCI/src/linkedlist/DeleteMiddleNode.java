package linkedlist;

public class DeleteMiddleNode {
	static class Node {
		int data;
		Node next;
	}
	public static void main(String[] args) {
		Node head = null;
		deleteMiddle(head);
	}
	
	static void deleteMiddle(Node head) {
		if (head == null || head.next == null || head.next.next == null)
	        return;

		Node slow = head, fast = head, prev = null;
		while(fast != null || fast.next!= null) {
				prev = slow;
				slow = slow.next;
				fast = fast.next.next;
		}
		
		prev = slow.next;		
	}
}
