class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> ans=new ArrayList<>();
    Stack<TreeNode> st=new Stack<>();
    st.push(root);
    while(st.size()>0){
        if(root==null)return ans;
        TreeNode top=st.pop();
        ans.add(top.val);
        if(top.right !=null)st.push(top.right);
        if(top.left !=null)st.push(top.left);
    }
    return ans;
    }

}