import java.util.Arrays;

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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        // Initialize the matrix and fill it with -1
        int[][] matrix = new int[m][n];
        for (int[] row : matrix) {
            Arrays.fill(row, -1);
        }
        
        // Define boundaries
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        ListNode curr = head;
        
        // Traverse until boundaries overlap or the list runs out
        while (curr != null && top <= bottom && left <= right) {
            
            // 1. Move Left to Right
            for (int i = left; i <= right && curr != null; i++) {
                matrix[top][i] = curr.val;
                curr = curr.next;
            }
            top++; // Shrink top boundary
            
            // 2. Move Top to Bottom
            for (int i = top; i <= bottom && curr != null; i++) {
                matrix[i][right] = curr.val;
                curr = curr.next;
            }
            right--; // Shrink right boundary
            
            // 3. Move Right to Left
            for (int i = right; i >= left && curr != null; i--) {
                matrix[bottom][i] = curr.val;
                curr = curr.next;
            }
            bottom--; // Shrink bottom boundary
            
            // 4. Move Bottom to Top
            for (int i = bottom; i >= top && curr != null; i--) {
                matrix[i][left] = curr.val;
                curr = curr.next;
            }
            left++; // Shrink left boundary
        }
        
        return matrix;
    }
}