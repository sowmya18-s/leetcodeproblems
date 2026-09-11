class Solution {
    public int blooming(int x,int[] bloomDay,int m,int k){
        int count=0;
        int ans=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=x){
                count++;
            }
            else{
                ans+=count/k;
                count=0;
            }
        }
        ans+=count/k;
        return ans;
    }
    public int maxxy(int[] bloomDay){
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            maxx=Math.max(maxx,bloomDay[i]);
        }
        return maxx;
    }
    public int minny(int[] bloomDay){
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            minn=Math.min(minn,bloomDay[i]);
        }
        return minn;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)bloomDay.length<(long)m*k){
            return -1;
        }
        int low=minny(bloomDay);
        int high=maxxy(bloomDay);
        while(low<=high){
            int mid=(low+high)/2;
            int check=blooming(mid,bloomDay,m,k);
            if(check>=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}