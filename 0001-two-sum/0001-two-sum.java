class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int b=target-nums[i];
            if(hm.containsKey(b)){
                return new int[]{i,hm.get(b)};
            }
            hm.put(nums[i],hm.getOrDefault(nums[i],i));
        }
        return new int[]{};
    }
}