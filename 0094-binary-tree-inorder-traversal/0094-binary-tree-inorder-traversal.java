class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        while(st.size()>0 || curr !=null){
            if(curr!=null){
                if(curr.left!=null){
                    st.push(curr);
                    curr=curr.left;
                } else{
                    ans.add(curr.val);
                    curr=curr.right;
                }
            }else{
                TreeNode top=st.pop();
                ans.add(top.val);
                curr=top.right;
            }
        }
        return ans;
    }
}