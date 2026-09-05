class Solution {
    public static void reverse(ListNode head){
         ListNode curr=head;
		ListNode fwd=null;
		ListNode prev=null;
		while(curr!=null) {
			fwd=curr.next;
			curr.next=prev;
			prev=curr;
			curr=fwd;
		}
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode (-1);
        ListNode temp=dummy;
        dummy.next=head;
        for(int i=1;i<=left-1;i++){
            temp=temp.next;
        }
        ListNode tail1=temp;
        ListNode head2=temp.next;
        temp=dummy;
        for( int i=1;i<=right;i++){
            temp=temp.next;
        }
        ListNode tail2=temp;
        ListNode head3=temp.next;
        tail2.next = null;
        reverse(head2);
        tail1.next=tail2;
        head2.next=head3;
        return dummy.next;
    }
}