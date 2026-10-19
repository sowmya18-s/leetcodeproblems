class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int low=0,high=nums.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int start=low;
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int end=high;
        for(int i=start;i<=end;i++){
            list.add(i);
        }
        return list;

    }
}