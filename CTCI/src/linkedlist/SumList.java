package linkedlist;

//This code need to modify minor things based on linked list
public class SumList {

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
	
	static void sum(Node list1, Node list2){
		int length1 = length(list1), length2 = length(list2);
		Node list = null;
		if(length1 != length2) {
			int diff = Math.abs(length2-length1);
			if(length1 > length2)
				list2 = padding(list2, diff);
			else
				list1 = padding(list1, diff);
		}
		int carry = 0;
		while(list1!=null) {
			if((list1.data+list2.data + carry) > 9) {
				list.data = (list1.data+list2.data + carry) % 10;
				carry = 1;
			} else {
				list.data = list1.data+list2.data + carry;
				carry = 0;
			}
		}
	}
	
	static int length(Node list) {
		int length = 0;
		while(list!=null) {
			length++;
			list = list.next;
		}
		return length;
	}
	
	static Node padding(Node list, int diff) {
		Node temp = list;
		while(temp.next!=null) {
			temp = temp.next;
		}
		for(int i=0;i<diff; i++) {
			temp.next = new Node(0);
			temp = temp.next;
		}
		return list;
	}
}