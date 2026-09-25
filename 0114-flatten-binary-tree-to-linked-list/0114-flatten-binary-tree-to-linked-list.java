class Solution {
    public void flatten(TreeNode root) {
        if(root==null)return;
      TreeNode lst=root.left;
      TreeNode rst=root.right;
      root.left=null;
      root.right=null;
      flatten(lst);
      flatten(rst);
      root.right=lst;
      TreeNode last=root;
      while(last.right!=null)last=last.right;
      last.right=rst;
    }
}