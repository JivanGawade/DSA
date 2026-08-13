class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return ans;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        int totalElements = m * n;
        
        while (ans.size() < totalElements) {
            
            for(int j = left; j <= right && ans.size() < totalElements; j++) {
                ans.add(matrix[top][j]);
            }
            top++;
            
            for(int i = top; i <= bottom && ans.size() < totalElements; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            
            for(int j = right; j >= left && ans.size() < totalElements; j--) {
                ans.add(matrix[bottom][j]);
            }
            bottom--;
            
            for(int i = bottom; i >= top && ans.size() < totalElements; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        
        return ans;
    }
}