class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int low=0,high=nums.length-1,i=nums.length-1;
        while(low<=high){
            int squares1=nums[low]*nums[low];
            int squares2=nums[high]*nums[high];
            if(squares1>squares2){
                ans[i]=squares1;
                i--;
                low++;
            }
            else{
                ans[i]=squares2;
                i--;
                high--;
            }
        }
        return ans;
    }
}