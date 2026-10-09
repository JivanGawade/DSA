class Solution {
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> arr=new ArrayList<>();
       inorder(root,arr);
       return arr.get(k-1); 
    }
    public void inorder(TreeNode root,List<Integer> arr){
        if(root==null)return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}