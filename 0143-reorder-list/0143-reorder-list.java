class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        } 
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; 

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        ListNode p1 = head;
        ListNode p2 = prev; 

        while (p2 != null) {
            ListNode p1Next = p1.next;
            ListNode p2Next = p2.next;
            p1.next = p2;
            p2.next = p1Next;
            p1 = p1Next;
            p2 = p2Next;
        }
    }
}