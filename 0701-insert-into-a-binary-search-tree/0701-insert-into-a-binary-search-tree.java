class Solution {
    public void attach(TreeNode root,int key){
        if(root==null)return;
        if(root.val==key)return;
        if(root.val< key){
            if(root.right==null){
                root.right=new TreeNode(key);
            }
            else attach(root.right,key);
        }else{
            if(root.left==null)root.left=new TreeNode(key);
            else attach(root.left,key);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        attach(root,key);
        return root;
    }
}