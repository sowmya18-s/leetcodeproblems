class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int low=0,high=people.length-1;
        int count=0;
        while(low<=high){
            int sum=people[low]+people[high];
            if(sum<=limit){
                low++;
            }
            high--;
            count++;
        }
        return count;
    }
}