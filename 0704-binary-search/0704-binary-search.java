class Solution {
    public int binary(int[] nums,int low,int high,int target){
        int mid=(low+high)/2;
        if (low > high) {
            return -1;
        }
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return binary(nums,low,mid-1,target);
        }
        else{
            return binary(nums,mid+1,high,target);
        }
    }
    public int search(int[] nums, int target) {
        int count=binary(nums,0,nums.length-1,target);
        return count;
    }
}