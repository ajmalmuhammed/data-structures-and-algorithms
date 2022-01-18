class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int result=0,count=1;
        for(int i=0; i< flowerbed.length; i++){
           if(flowerbed[i]==0){
               count++;
           }
            else{
                System.out.println("count "+count);
                result +=(count-1)/2;
                count=0;
            }
    }
        if(count!=0){
            result += count/2;
        }
        System.out.println(count+" "+result);
        return result>=n;
}
}