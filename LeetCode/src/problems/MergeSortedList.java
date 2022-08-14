package problems;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeSortedList {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null)
			return null;
		else if(l1 == null)
			return l2;
		else if(l2 == null)
			return l1;

		ListNode mergedList = new ListNode(0), temp = mergedList;

		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}

		if(l1 == null && l2!= null)
			temp.next = l2;
		else if(l1 != null && l2== null)
			temp.next = l1;
		return mergedList.next;
	}

	public static void main(String[] args) {

	}
}