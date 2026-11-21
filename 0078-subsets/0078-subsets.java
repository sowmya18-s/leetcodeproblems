class Solution {
    public void sets(int ind,List<List<Integer>> ans,int[] nums,ArrayList<Integer> temp){
        if(ind>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        sets(ind+1,ans,nums,temp);
        temp.remove(temp.size()-1);
        sets(ind+1,ans,nums,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        sets(0,ans,nums,temp);
        return ans;
    }
}