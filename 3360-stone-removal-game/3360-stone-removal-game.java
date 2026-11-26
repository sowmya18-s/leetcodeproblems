class Solution {
    public boolean canAliceWin(int n) {
        boolean res=true;
        int count=10;
        while(n>=count){
            n=n-count;
            count--;

        }
        if(count%2==0){
            res=false;
        }
        return res;
    }
}