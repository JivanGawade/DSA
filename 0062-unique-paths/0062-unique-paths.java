class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m + 1][n + 1];
        return helper(m, n, memo);
    }
    
    private int helper(int m, int n, int[][] memo) {
        // Base cases
        if (m == 1 || n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        if (memo[m][n] > 0) {
            return memo[m][n];
        }
        
        memo[m][n] = helper(m - 1, n, memo) + helper(m, n - 1, memo);
        
        return memo[m][n];
    }
}