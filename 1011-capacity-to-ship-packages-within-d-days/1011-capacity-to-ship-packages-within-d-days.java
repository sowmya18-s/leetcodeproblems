class Solution {
    public int check(int x,int[] weights,int days){
        int sum=0;
        int ans=1;
        for(int i=0;i<weights.length;i++){
            if((sum+weights[i])>x){
                sum=weights[i];
                ans++;
            }
            else{
                sum+=weights[i];
            }
        }
        return ans;
    }
    public int shipWithinDays(int[] weights, int days) {
        int m=0,low=0;
        for(int i=0;i<weights.length;i++){
            m+=weights[i];
            low=Math.max(low,weights[i]);
        }
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int result=check(mid,weights,days);
            if(result>days){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

    }
}