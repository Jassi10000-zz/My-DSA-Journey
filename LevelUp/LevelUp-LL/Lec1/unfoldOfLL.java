class unfoldOfLl {

    // 1st method
    // public static void unfold(ListNode head) {
    //     if (head == null || head.next == null)
    //         return;

    //     ListNode l1 = new ListNode(-1);
    //     ListNode l2 = new ListNode(-1);
    //     ListNode p1 = l1, p2 = l2, c1 = head, c2 = head.next;

    //     while (c1 != null && c2 != null) {
    //         p1.next = c1;
    //         p2.next = c2;

    //         p1 = p1.next;
    //         p2 = p2.next;

    //         if (c2 != null) // for odd Len
    //             c1 = c2.next;
    //         if (c1 != null) // for even
    //             c2 = c1.next;
    //     }

    //     p1.next = null;
    //     p2 = reverse(l2.next);
    //     p1.next = p2;
    // }


    //  2nd method
    public static void unfold(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        
        ListNode p1 = l1 , p2 = l2;

        p1.next = head;
        p2.next = head.next;



        while (p2 != null && p2.next != null) {
          
            ListNode f = p2.next;

            p1.next = f;
            p2 = f.next;

            p1 = p1.next;
            p2 = p2.next;

        }

        p1.next = null;
        p2 = reverse(l2.next);
        p1.next = p2;
    }
}


