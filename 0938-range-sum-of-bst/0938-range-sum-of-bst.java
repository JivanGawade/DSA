class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root==null)return 0;
        if(low<=root.val && root.val<=high){
        sum+=root.val;
        }
        if(root.val>low){
        sum+=rangeSumBST(root.left,low,high);
        }
        if(root.val<high){
        sum+=rangeSumBST(root.right,low,high);
        }
        return sum;
    }
}