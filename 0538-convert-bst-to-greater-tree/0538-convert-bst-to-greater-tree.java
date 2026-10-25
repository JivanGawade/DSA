class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        storeInOrder(root, list);
        int Sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            TreeNode curr = list.get(i);
            Sum += curr.val;
            curr.val = Sum;
        }
        return root;
    }
    
    public void storeInOrder(TreeNode root, ArrayList<TreeNode> list) {
        if (root == null) {
            return;
        }
        storeInOrder(root.left, list);  
        list.add(root); 
        storeInOrder(root.right, list);
    }
}