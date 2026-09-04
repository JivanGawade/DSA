class Solution {
public:
    int reverse(int x) {
        long long  ans = 0;
        while(x!=0){
        int digit = x % 10;
        ans = (10*ans)+digit;
        x= x / 10;
        }
        if(ans > INT_MAX || ans < INT_MIN)
        return 0;
            return ans ;
    }

};