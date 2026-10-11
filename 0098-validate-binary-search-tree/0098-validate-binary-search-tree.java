class Solution {
    class Pair{
        long max;
        long min;
        Pair(long max,long min){
            this.max=max;
            this.min=min;
        }
    }
     boolean flag;
    public boolean isValidBST(TreeNode root) {
        flag=true;
        minMax(root);
        return flag;

    }
    public Pair minMax(TreeNode root){
        if (root == null) {
            return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
        }
        Pair lst=minMax(root.left);
        Pair rst=minMax(root.right);
        long max=Math.max(root.val,Math.max(lst.max,rst.max));
        long min =Math.min(root.val,Math.min(lst.min,rst.min));
        if(lst.max>=root.val || rst.min<=root.val)flag=false;
        return new Pair(max,min);
    }
}