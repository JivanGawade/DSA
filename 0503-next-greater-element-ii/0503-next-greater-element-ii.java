class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n]; 
            
            while (st.size() > 0 && curr >= st.peek()) {
                st.pop();
            }
            if (i < n) {
                if (st.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }
            st.push(curr);
        }
        return ans;
    }
}