package problems;

public class SwapNodesPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode virtual = new ListNode(0), curr = virtual;
        virtual.next = head;
        while(curr.next != null && curr.next.next != null) {
            ListNode first = curr.next, second = curr.next.next;
            first.next = second.next;
            curr.next = second;
            curr.next.next = first;
            curr = curr.next.next;
        }

        return virtual.next;
    }

    public static void main(String[] args) {
        ListNode head4 = new ListNode(4);
        ListNode head3 = new ListNode(3, head4);
        ListNode head2 = new ListNode(2, head3);
        ListNode head = new ListNode(1, head2);
        swapPairs(head);
    }
}
