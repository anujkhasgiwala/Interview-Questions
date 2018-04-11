package problems.linkedlist;

public class Delete {
	public static void main(String[] args) {
		Node head = new Node();
		head.data = 2;
		Node head1 = new Node();
		head.next = head1;
		head1.data = 3;
		Delete(head, 1);
	}
	
	static Node Delete(Node head,int position) {
		int count = 0;
		if(head == null) {
			return head;
		} else {
			Node temp = head;
			while(count < position-1) {
				temp = temp.next;
				count++;
			}
			temp.next = temp.next.next;			
		}
		return head;
	}
}