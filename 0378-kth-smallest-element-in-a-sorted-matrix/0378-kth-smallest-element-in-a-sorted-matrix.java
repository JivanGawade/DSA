class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] ans = new int[rows * cols];
 
    for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                pq.add(matrix[i][j]);
                if (pq.size() > k) {
                    pq.remove();
                }
            }
        }
    return pq.peek();
    }
}