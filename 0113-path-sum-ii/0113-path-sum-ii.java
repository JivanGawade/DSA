class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        if(root==null)return ans;
        dfs(root,arr,ans,targetSum);
        return ans;
    }
    public void dfs(TreeNode root,List<Integer> arr,List<List<Integer>> ans,int targetSum ){
        arr.add(root.val);
        if(targetSum == root.val && root.left == null && root.right == null){
            ans.add(new ArrayList<>(arr));
        }
        if(root.left!=null)dfs( root.left, arr, ans,targetSum-root.val );
        if(root.right!=null)dfs( root.right, arr, ans,targetSum-root.val);
        arr.remove(arr.size()-1);
    }
}