class Solution {
    public int tribonacci(int n) {
             
        int curr=1, prev1=1, prev2=1,prev3=0;
        if(n<=0) return 0;
        if(n<=2) return 1;
        for(int i=3; i<=n; i++){ 
            curr = prev1+prev2+prev3; 
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return curr;
    }
}