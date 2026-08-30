class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
		ListNode fwd=null;
		ListNode prev=null;
		while(curr!=null) {
			fwd=curr.next;
			curr.next=prev;
			prev=curr;
			curr=fwd;
		}return prev;
    }
}