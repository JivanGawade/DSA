class Solution {
    public void flatten(TreeNode root) {
        List<TreeNode> ans=new ArrayList<>();
        dfs(root,ans);
        for(int i=0;i<ans.size()-1;i++){
            TreeNode a=ans.get(i);
            TreeNode b=ans.get(i+1);
            a.right=b;
            a.left=null;
        }
    }
    public static void dfs(TreeNode root,List<TreeNode> ans){
        if(root==null)return;
        ans.add(root);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
}