package problems.linkedlist;

public class InsertAtTail {
	public static void main(String[] args) {
		Node head = new Node();
		head.data = 1;
		Node head1 = new Node();
		head.next = head1;
		head1.data = 2;
		Insert(head, 3);
	}
	static Node Insert(Node head,int data) {
		if(head == null) {
			head = new Node();
			head.data = data;
			return head;
		} else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			Node n1 = new Node();
			temp.next = n1;
			n1.data = data;
		}
		return head;
	}
}