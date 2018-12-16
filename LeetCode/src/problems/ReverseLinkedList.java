package problems;

/*class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}*/

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null, curr = head, next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;

        return head;
    }
}
