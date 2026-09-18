
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> ans=new ArrayList<>();
        traverse(root ,ans);
        return ans;
    }
    public static void traverse(TreeNode root,List<Integer> ans){
        if(root==null)return;
        ans.add(root.val);
        traverse(root.left,ans);
        traverse(root.right,ans);
    }
}