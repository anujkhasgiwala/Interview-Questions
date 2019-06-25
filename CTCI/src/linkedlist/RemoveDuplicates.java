package linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
	static class Node{
		int data;
		Node next;
	}

	public static void main(String[] args) {
		Node head=null;
		removeDuplicateWithoutBuffer(head);
	}

	//O(n2)
	static void removeDuplicateWithoutBuffer(Node head) {
		Node current = head;
		while (current != null) {
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	//O(nLogn) using merge sort
}