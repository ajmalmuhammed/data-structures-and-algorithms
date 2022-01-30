class Solution {
    public int fib(int n) {
        //tabulation method
        int curr=0,prev1=1,prev2=0;
        if(n==0) return 0;
        for(int i=2; i<=n; i++){
            curr = prev1+prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
}