class Solution {
    public int sum(int x,int[] arr){
        int summ=0;
        for(int i=0;i<arr.length;i++){
            summ+=(arr[i]+x-1)/x;
        }
        return summ;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int ans=sum(mid,nums);
            if(ans<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}