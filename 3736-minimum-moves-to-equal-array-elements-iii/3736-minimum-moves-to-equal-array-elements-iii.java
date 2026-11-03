class Solution {
    public int minMoves(int[] nums) {
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=high-nums[i];
        }
        return count;
    }
}