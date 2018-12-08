package problems;

public class LinkedListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        int lenA = 0, lenB = 0;
        ListNode temp = headA;
        while(temp != null) {
            lenA++;
            temp = temp.next;
        }

        temp = headB;
        while(temp != null) {
            lenB++;
            temp = temp.next;
        }

        int diff = Math.abs(lenA - lenB);

        if(lenA > lenB) {
            int i = 0;
            while (i < diff) {
                headA = headA.next;
                i++;
            }
        } else {
            int i = 0;
            while (i < diff) {
                headB = headB.next;
                i++;
            }
        }

        while(headA != null && headB != null) {
            if(headA.val == headB.val)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
