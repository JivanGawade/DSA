/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Min-Heap to store the current nodes, sorted by value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each non-empty list to the heap
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        // Dummy node helps to easily return the head of the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Process the heap
        while (!minHeap.isEmpty()) {
            // Extract the smallest node
            ListNode smallest = minHeap.poll();
            tail.next = smallest;
            tail = tail.next;

            // If there is a next node in the same list, add it to the heap
            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next;
    }
}