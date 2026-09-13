class Solution {
    public int[] getConcatenation(int[] arr) {
        int n=arr.length;
        int [] ans =new int [2*n];
        for(int i=0;i<=n-1;i++){
            ans[i]=arr[i];
            ans[i+n]=arr[i];
        }
        return ans;
    }
}