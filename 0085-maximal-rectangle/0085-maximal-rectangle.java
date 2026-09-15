class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0; 
                }
            }
            
            int area = getMaxArea(heights);
            max = Math.max(max, area);
        }
        
        return max;
    }
    
    public int getMaxArea(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;
        
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        nse[n-1] = n; 
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        
        while(st.size()>0) st.pop();

        int[] pse = new int[n];
        pse[0] = -1; 
        st.push(0);
        for(int i=1; i<n; i++){
            while(st.size()>0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        
        int maxArea = 0;
        for(int i=0; i<n; i++){
            int area = arr[i] * (nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}