class Solution {
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] ^= 1;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            int zeros = 0, ones = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0) zeros++;
                else ones++;
            }
            if (zeros > ones) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] ^= 1;
                }
            }
        }
        int sum = 0, pow = 1;
        for (int j = n - 1; j >= 0; j--) {
            int ones = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 1) ones++;
            }
            sum += pow * ones; 
            pow *= 2;          
        }
        return sum;
    }
}