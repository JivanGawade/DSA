class Solution {
    public boolean isSymmetric(TreeNode root) {
        invertTree(root.left);
        return isSameTree(root.right,root.left);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        if(p.val != q.val)return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}