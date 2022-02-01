class Solution {
    public int climbStairs(int n) {
        // it is basically a fibonacci number
        int curr=0,prev1=2,prev2=1;
        if(n<=1) return n;
        
        for(int i=2; i<n; ++i){
            curr = prev1+prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
}