class palindrome{
    public static boolean isPalindrome(ListNode head){

        if(head == null || head.next == null){
            return head;
        }
    
        ListNode mid = midNode(head);
        ListNode nHead = mid.next;
        mid.next = null;
    
        nHead = reverse(nHead);
    
        LisNode c1 = head , c2 = nHead;
    
        boolean res = true;
        while(c2 != null){
            if(c1.val  != c2.val){
                res = false;
                break;
            }
    
            c1=c1.next;
            c2=c2.next;
        }    
    
        nhead = reverse(nhead);
        mid.next = nhead;
        return true;
    
    }
}