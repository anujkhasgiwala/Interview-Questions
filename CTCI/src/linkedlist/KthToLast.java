package linkedlist;

public class KthToLast {
	static class Node{
		int data;
		Node next;
	}
	public static void main(String[] args) {
		Node head=null;
		int k=1;
		kthToLast(head, k);
	}
	
	static void kthToLast(Node head, int k) {
		if(head == null)
			return;

		Node main = head, ref = head;
		int count = 0;

		while(count < k) {
			if(ref == null) {
				System.out.println("not possible");
			}
			ref = ref.next;
			count ++;
		}

		while(ref != null) {
			main = main.next;
			ref = ref.next;
		}

		System.out.println(main.data);
	}
}