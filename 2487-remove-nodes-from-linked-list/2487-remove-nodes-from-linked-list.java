class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null) return null;
        head = reverseList(head);
        
        ListNode curr = head;
        int maxSoFar = curr.val;
        while (curr != null && curr.next != null) {
            if (curr.next.val < maxSoFar) {
                curr.next = curr.next.next;
            } else {
                maxSoFar = curr.next.val;
                curr = curr.next;
            }
        }
        return reverseList(head);
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        return prev;
    }
}