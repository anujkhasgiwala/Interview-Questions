package linkedlist;

public class PartitionList {
	static class Node{
		int data;
		Node next;
	}
	public static void main(String[] args) {
		
	}

	//preserve the order of node occurence
	static void partition(Node list, int x) {
		Node head = list, tail = list; //create new list
		
		while(list != null) {
			Node curr = list.next;
			if(list.data < x) {
				list.next = head;
				head = list;
			} else {
				tail.next = list;
				tail = list;
			}
			list = curr;
		}
		tail.next = null;
	}
}