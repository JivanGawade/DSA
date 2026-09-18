
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        traverse(root ,ans);
        return ans;
    }
    public static void traverse(TreeNode root,List<Integer> ans){
        if(root==null)return;
        traverse(root.left,ans);
        traverse(root.right,ans);
        ans.add(root.val);
    }

}
