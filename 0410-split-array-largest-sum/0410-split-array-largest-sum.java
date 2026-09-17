class Solution {
    public int check(int[] nums,int pages){
        int ss=0,count=1;
        for(int i=0;i<nums.length;i++){
            if((ss+nums[i])<=pages){
                ss+=nums[i];
            }
            else{
                count++;
                ss=nums[i];
            }
        }
        return count;
    }
    public int findPages(int[] nums, int m) {
        if(nums.length<m){
            return -1;
        }
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
            low=Math.max(low,nums[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int ans=check(nums,mid);
            if(ans<=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int splitArray(int[] nums, int k) {
        int anss=findPages( nums, k);
        return anss;
    }
}