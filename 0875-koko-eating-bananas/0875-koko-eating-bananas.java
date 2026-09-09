class Solution {
    public long ceil(int x,int[] piles){
        long total=0;
        for(int i=0;i<piles.length;i++){
            total+=(piles[i]+x-1)/x;
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            long res=ceil(mid,piles);
            if(res<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }    
        
        return low;
    }
}