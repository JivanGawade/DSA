class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        int n=arr.length;
        int m=(1<<n);
        List<List<Integer>> ans=new ArrayList<>();
        for (int i=0;i<m;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i>>j)%2==1)a.add(arr[j]);
            }
            ans.add(a);
        }
        return ans;
    }
}