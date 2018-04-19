package linkedlist;

public class Palindrome {
	static class Node {
		int data;
		Node next;
		Node(int d)
        {
            data = d;
            next = null;
        }
	}
	public static void main(String[] args) {
		
	}

	//reverse technique
	//Can be improved by just reversing the second half of list
	static void reverse(Node list) {
		Node prev = null, curr = list, next;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		list = prev;
	}
	
	static void compare(Node list1, Node list2) {
		if(list1 == null || list2 == null)
			return;
		
		while(list1 !=null && list2 != null) {
			if(list1.data == list2.data) {
				list1 = list1.next;
				list2 = list2.next;
			} else {
				return;
			}
		}
	}
	
	//recursion technique
}