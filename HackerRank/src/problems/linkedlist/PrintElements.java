package problems.linkedlist;

public class PrintElements {
	public static void main(String[] args) {
		Node head = new Node();
		head.data = 1;
		Node head1 = new Node();
		head.next = head1;
		head1.data = 2;
		Node head2 = new Node();
		head1.next = head2;
		head2.data = 3;
		Print(head);
	}

	static void Print(Node head) {
		if(head == null)
			return;
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}

class Node {
	int data;
	Node next;
}