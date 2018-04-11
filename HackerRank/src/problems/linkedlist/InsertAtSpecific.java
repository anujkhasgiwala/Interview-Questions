package problems.linkedlist;

public class InsertAtSpecific {
	public static void main(String[] args) {
		Node head = new Node();
		head.data = 3;
		Node head1 = new Node();
		head.next = head1;
		head1.data = 5;
		Node head2 = new Node();
		head1.next = head2;
		head2.data = 4;
		Node head3 = new Node();
		head2.next = head3;
		head3.data = 2;
		
		InsertNth(head, 10, 1);
	}

	static Node InsertNth(Node head, int data, int position) {
		int count = 0;
		if(head == null) {
			head = new Node();
			head.data = data;
			return head;
		} else {
			Node temp = head;
			while(count < position) {
				temp = temp.next;
				count++;
			}
			Node n1 = new Node();
			n1.next = temp;
			head.next = n1;
			n1.data = data;
		}
		return head;
	}
}