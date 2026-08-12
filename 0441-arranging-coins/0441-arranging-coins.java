class Solution {
   
    public long mySqrt(long x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        long lo = 1;
        long hi = x;
        long root = 0;
        
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
           
            if (mid > x / mid) {
                hi = mid - 1;
            } else {
                root = mid;  
                lo = mid + 1;  
            }
        }
        
        return root;
    }

    public int arrangeCoins(int n) {
        long discriminant = 8L * n + 1;
        
        return (int) ((mySqrt(discriminant) - 1) / 2);
    }
}