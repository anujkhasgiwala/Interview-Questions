package Random;

public class RemoveNthElementFromLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(5);
	}
	
	static ListNode remove(ListNode head, int n) {
		if(head == null)
			return null;
		ListNode temp = head;
		int size = 0;
		while(temp != null) {
			size++;
			temp = temp.next;
		}

		if((size-n+1)==1)
	        return head.next;
        
        temp = head;		
		int pos = 0;
		if(n<=size) {
			for(int i =0; i<size-n;i++){
				pos++;
				if(pos == size-n)
					temp.next = temp.next.next;
				temp = temp.next;
			}
		}
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}