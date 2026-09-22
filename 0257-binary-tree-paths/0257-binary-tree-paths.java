class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) return ans; 
        dfs(root, "", ans);
        return ans;
    }
    public void dfs(TreeNode root, String s, List<String> ans) {
        if (root == null) return;
        s += root.val;
        if (root.left == null && root.right == null) {
            ans.add(s);
            return;
        }
        s += "->";
        dfs(root.left, s, ans);
        dfs(root.right, s, ans);
    }
}