class Solution {
    public int fib(int n) {
        //tabulation method
        int fibNums[] = new int[n+1];
        fibNums[0]=0;
        if(n>0){
            fibNums[1]=1;
            for(int i=2; i<=n; i++){
                fibNums[i] = fibNums[i-1]+fibNums[i-2];
            }
        }
        return fibNums[n];
    }
}