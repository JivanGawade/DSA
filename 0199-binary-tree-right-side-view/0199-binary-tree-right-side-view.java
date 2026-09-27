class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        veiw(root,0,ans);
        return ans;
    }
    public static void veiw(TreeNode root,int level, List<Integer> ans){
        if(root==null)return;
        if(level>=ans.size())ans.add(root.val);
        else ans.set(level,root.val);
        veiw(root.left,level+1,ans);
        veiw(root.right,level+1,ans);
    }
}