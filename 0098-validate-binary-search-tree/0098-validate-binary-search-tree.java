class Solution {
    public boolean isValidBST(TreeNode root) {
      List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        long prev = Long.MIN_VALUE; 
        
        while (curr != null) {
            if (curr.left != null) {
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    if(curr.val<=prev)return false;
                    prev=curr.val;
                    ans.add(curr.val);
                    curr = curr.right;
                }
                
            } else {
                if(curr.val<=prev)return false;
                prev=curr.val;
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        
        return true;
    }
}