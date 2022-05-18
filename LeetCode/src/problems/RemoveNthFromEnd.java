package problems;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }

        int counter = 0;
        ListNode first = head, second = head;

        while(counter < n) {
            first = first.next;
            counter++;
        }

        if(first != null) {
            while (first.next != null) {
                first = first.next;
                second = second.next;
            }

            second.next = second.next.next;
        }

        return head;
    }
}
