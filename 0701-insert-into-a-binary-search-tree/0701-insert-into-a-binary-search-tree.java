class Solution {
    public TreeNode insertIntoBST(TreeNode root, int key) {
       if(root==null)return new TreeNode (key);
        if(root.val==key)return root;
        else if(root.val<key)root.right=insertIntoBST(root.right,key);
        else root.left=insertIntoBST(root.left,key);
        return root;
    }
}