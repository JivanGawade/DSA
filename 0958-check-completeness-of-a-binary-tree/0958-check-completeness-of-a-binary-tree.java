class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean pastNull = false; 
        
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            
            if (curr == null) {
                pastNull = true;
            } else {
                if (pastNull) {
                    return false;
                }
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        
        return true;
    }
}