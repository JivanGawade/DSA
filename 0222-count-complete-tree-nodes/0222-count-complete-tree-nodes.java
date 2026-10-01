class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int leftSize=leftCountNodes(root);
        int rightSize=RightCountNodes(root);
        if(leftSize==rightSize){
            return (int) Math.pow(2, leftSize) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public int leftCountNodes(TreeNode root){
        int height=0;
        while(root!=null){
            height++;
            root=root.left;
        }
        return height;
    }
    public int RightCountNodes(TreeNode root){
        int height=0;
        while(root!=null){
            height++;
            root=root.right;
        }
        return height;
    }
}