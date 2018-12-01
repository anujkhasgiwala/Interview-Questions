package problems;

class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;

        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = slow;
        slow = head;

        ListNode prev=null, curr=fast, next=null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        fast = prev;
        boolean flag = false;
        while(fast != null) {
            if(slow.val != fast.val) {
                slow = slow.next;
                fast = fast.next;
            } else
                flag = true;
        }

        if(flag)
            return true;
        else
            return false;
    }
}