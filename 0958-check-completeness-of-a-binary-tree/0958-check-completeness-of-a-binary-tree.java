class Solution {
    static int s;
    public boolean isCompleteTree(TreeNode root) {
        s = size(root);
        return check(root,1);
    }
    public int size(TreeNode root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public boolean check(TreeNode root,int i){
        if(root==null) return true;
        if(i>s) return false;
        boolean left = check(root.left,i*2);
        boolean right = check(root.right,i*2+1);
        return left && right;
    }
}