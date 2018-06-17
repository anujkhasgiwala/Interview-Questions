package Test;

class LinkedList {
	 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    static Node reverse(Node node) {
    	Node curr = node;
    	Node prev=null, next=null;
       while(curr != null) {
    	   next = curr.next;
    	   curr.next = prev;
    	   prev = curr;
    	   curr = next;
       }
       
       node = prev;
       return node;
    }
 
    // prints content of linked list in reverse
    static void printList(Node node) {
        if(node == null)
        	return;
      
        System.out.print(node.data+" ");
        printList(node.next);
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        
        list.head = reverse(list.head);
        printList(list.head);
    }
}