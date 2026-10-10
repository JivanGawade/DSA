class Solution {
    private static int sum=0;
    public static TreeNode bstToGst(TreeNode root) {
        sum=0;
        revInorder(root);
        return root;
    }
    private static void revInorder(TreeNode root){
        if(root==null)return;
        revInorder(root.right);
        sum += root.val;
        root.val = sum;
        revInorder(root.left);
    }
}