class foldOfLL {
    public static void FoldLL(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = midNode(head);

        ListNode nhead = mid.next;

        mid.next = null;

        nhead = reverse(nhead);

        ListNode c1 = head;
        ListNode c2 = nhead;

        // this condition is valid for both odd and even length
        while (c2 != null) {

            ListNode f1 = c1.next, f2 = c2.next;

            c1.next = c2;
            c2.next = f1;

            c1 = f1;
            c2 = f2;

        }
    }
}