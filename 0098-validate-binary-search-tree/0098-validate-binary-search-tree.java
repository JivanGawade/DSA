class Solution {
    public boolean isValidBST(TreeNode root) {
       List<Integer> arr=new ArrayList<>();
       inorder(root,arr);
       for (int i = 1; i < arr.size(); i++) {
           if (arr.get(i) <= arr.get(i - 1)) {
               return false;
           }
        }
       return true;
    }

    public void inorder(TreeNode root, List<Integer> arr){
        if(root==null)return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    
}