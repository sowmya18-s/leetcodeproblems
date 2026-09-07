class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int elementt=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                elementt=nums[i];
            }
            else if(nums[i]==elementt){
                count++;
            }
            else{
                count--;
            }
        }
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elementt){
                counter++;
            }
            if(counter>nums.length/2){
                return elementt;
            }
        }
        return -1;
    }
}