class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return build(0, n - 1, 0, n - 1, inorder, preorder);
    }

    private static TreeNode build(int inlo, int inhi, int prelo, int prehi, int[] inorder, int[] preorder) {
        if (prelo > prehi || inlo > inhi) return null;
        
        int val = preorder[prelo];
        TreeNode root = new TreeNode(val);
        
        int r = 0;
        for (int i = inlo; i <= inhi; i++) {
            if (inorder[i] == val) {
                r = i;
                break;
            }
        }
        
        int cnt = r - inlo;
        root.left = build(inlo, r - 1, prelo + 1, prelo + cnt, inorder, preorder);
        root.right = build(r + 1, inhi, prelo + cnt + 1, prehi, inorder, preorder);
        
        return root;
    }
}
