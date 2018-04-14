package linkedlist;

public class KthToLast {
	static class Node{
		int data;
		Node next;
	}
	public static void main(String[] args) {
		Node head=null;
		int k=1;
		recursive(head, k);
		iterative(head, k);
	}
	
	static int recursive(Node head, int k) {
		if(head == null)
			return 0;
		int i = recursive(head.next, k)+1;
		if(i==k)
			System.out.println(head.data);
		return i;
	}
	
	static void iterative(Node head, int k) {
		if(head == null)
			return;
		Node curr = head;
		while(k>0) {
			curr = curr.next;
			k--;
		}
		
		Node next = head;
		while(curr != null) {
			curr = curr.next;
			next = next.next;
		}
		System.out.println(next.data);
	}
}