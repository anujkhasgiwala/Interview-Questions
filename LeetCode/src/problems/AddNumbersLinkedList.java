package problems;

public class AddNumbersLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = new ListNode(0), temp;
        temp = sumList;
        int sum = 0, carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;

            carry = sum / 10;
            sum = sum % 10;

            temp.next = new ListNode(sum);
            temp = temp.next;

            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next : l2;
        }

        return sumList.next;
    }
}
