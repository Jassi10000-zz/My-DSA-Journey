public static ListNode mergeLL(ListNode l1, ListNode l2) {

    if (l1 == null || l2 == null) {
        return l1 != null ? l1 : l2;
    }

    ListNode dummy = new ListNode(-1);
    ListNode prev = dummy, c1 = l1, c2 = l2;

    while (c1 != null && c2 != null) {

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

// public static ListNode mergeKLists(ListNode[] lists) {
//     if (lists.length == 0) {
//         return null;
//     }
//     // a new LL to behave as res LL
//     ListNode head = null;

//     for (ListNode node : lists) {
//         head = mergeLL(head, node);
//     }

//     return head;

// }

//  Time complexity : O(nk)




// Let's reduce it by divide and conquer technique

public static ListNode mergeKLists(ListNode[] lists){
    if(lists.length == 0){
        return null;
    }
    return mergeKList(lists , si , lists.length - 1);
}
public static ListNode mergeKList(ListNode[] lists , int si , int ei){

    if(si == ei) return lists[si];

    int mid = (si+ei)/2;

    ListNode leftMergedList = mergeKList(lists , si , mid);
    ListNode rightMergedList = mergeKList(lists , mid + 1 , ei);

    return mergeLL(leftMergedList , rightMergedList);

}

// TIme complexity : O(nlogk)