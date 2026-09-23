class Solution {
    public Integer prev;
    public int MinDiff=Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return MinDiff;
    }
    public void inorder(TreeNode root){
        if(root==null)return ;
        inorder(root.left);
        if(prev !=null){
            MinDiff=Math.min(MinDiff,root.val-prev);
        }
        prev=root.val;
        inorder(root.right);
    }
}