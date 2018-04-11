package problems.linkedlist;

public class InsertAtHead {
	public static void main(String[] args) {
		Node head = new Node();
		head.data = 2;
		Node head1 = new Node();
		head.next = head1;
		head1.data = 3;
		Insert(head, 1);
	}
	static Node Insert(Node head,int data) {
		if(head == null) {
			head = new Node();
			head.data = data;
			return head;
		} else {
			Node temp = head;
			Node n1 = new Node();
			n1.data = data;
			n1.next = temp;
			head = n1;			
		}
		return head;
	}
}