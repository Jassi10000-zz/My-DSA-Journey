public class merge2SortedLL {

    public static ListNode mergeLL(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2;
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy, c1 = l1, c2 = l2;

        while (c1 != null || c2 != null) {

            if (c1.val <= c2.val) {
                prev.next = c1;
                c1 = c1.next;
            } else {
                prev.next = c2;
                c2 = c2.next;
            }

            prev = prev.next;

        }
        prev.next = c1 != null ? c1 : c2;

        // this will give the head of the new merged LL
        return dummy.next;
    }
}