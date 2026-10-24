class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int a1=conversion(arriveAlice,days);
        int a2=conversion(arriveBob,days);
        int h1=conversion(leaveAlice,days);
        int h2=conversion(leaveBob,days);
        int start=Math.max(a1,a2);
        int end=Math.min(h1,h2);
        if(start>end){
            return 0;
        }
        return end-start+1;
    }
    public int conversion(String date,int[] days){
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int total = day;
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }
        return total;
    }
}