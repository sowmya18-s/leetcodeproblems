class Solution {
    public int maxDepth(String s) {
        int count=0;
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c1++;
            }
            else if(s.charAt(i)==')'){
                count=Math.max(count,c1);
                c1--;
            }
        }
        return count;
    }
}