class Solution {
    boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        return ((n & (n-1))==0);
    }
    boolean isSquare(long n){
        long root=(long)(Math.sqrt(n));
        return (root*root==n);

    }
    public boolean isPowerOfFour(int n) {
        return (isPowerOfTwo( n) && isSquare(n));
    }
}