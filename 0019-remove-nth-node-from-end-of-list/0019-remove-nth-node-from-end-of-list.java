class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dammy=new ListNode(-1);
        dammy.next=head;
        ListNode fast=dammy;
        ListNode slow=dammy;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dammy.next;
    }
}