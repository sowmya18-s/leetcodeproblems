class Solution {
    public int myAtoi(String s) {
        int j=0;
        long sign=1;
        while(j<s.length()&&s.charAt(j)==' '){
            j++;
        }
        if(j<s.length()&&s.charAt(j)=='-'){
            sign=-1;
            j++;
        }
        else if(j<s.length() && s.charAt(j)=='+'){
            j++;
        }
        long ans=0;
        for(int i=j;i<s.length();i++){
            if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                ans=(ans*10)+(s.charAt(i)-'0');
                if(ans*sign>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if(ans*sign<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
            else{
                break;
            }
        }
        return (int)(ans*sign);
    }
}