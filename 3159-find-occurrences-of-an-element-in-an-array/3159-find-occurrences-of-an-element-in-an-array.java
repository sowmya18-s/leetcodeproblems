class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                arr.add(i);
            }
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int ele=queries[i];
            if(ele<=arr.size()){
                ans[i]=arr.get(ele-1);
            }
            else{
                ans[i]=-1;
            }
        }

        return ans;
    }
}