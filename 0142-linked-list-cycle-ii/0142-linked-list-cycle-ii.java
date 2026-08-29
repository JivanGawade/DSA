public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode b = head;
                while (b != slow) {
                    b = b.next;
                    slow = slow.next;
                }
                return b;
            }
        }
        return null;
    }
}