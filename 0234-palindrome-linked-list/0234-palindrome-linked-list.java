class Solution {
    static ListNode reverse(ListNode head) {
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
		ListNode fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		ListNode head2 =slow.next;
		slow.next=null;
        head2=reverse(head2);
        ListNode i=head;
        ListNode j=head2;
        while(j!=null){
            if(i.val !=j.val)return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
}