class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int levelSize = q.size(); 
            List<Integer> currentLevel = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = q.poll();
                currentLevel.add(currentNode.val);
                
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        
        return result;
    
    }
}