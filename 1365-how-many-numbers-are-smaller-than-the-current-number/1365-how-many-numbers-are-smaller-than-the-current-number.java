class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int smaller=0;
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j])smaller++;
            }
            ans[i]=smaller;
        }
        return ans;

    }
}