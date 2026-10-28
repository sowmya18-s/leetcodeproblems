class Solution {
    public int romanToInt(String s) {
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        int count=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(ch=='I'&&i<s.length()-1){
                if(s.charAt(i+1)=='V'){
                    count+=V-I;
                    i++;
                }
                else if(s.charAt(i+1)=='X'){
                    count+=X-I;
                    i++;
                }
                else{
                    count+=I;
                }
            }
            else if(ch=='X'&&i<s.length()-1){
                if(s.charAt(i+1)=='L'){
                    count+=L-X;
                    i++;
                }
                else if(s.charAt(i+1)=='C'){
                    count+=C-X;
                    i++;
                }
                else{
                    count+=X;
                }
            }
            else if(ch=='C'&&i<s.length()-1){
                if(s.charAt(i+1)=='D'){
                    count+=D-C;
                    i++;
                }
                else if(s.charAt(i+1)=='M'){
                    count+=M-C;
                    i++;
                }
                else{
                    count+=C;
                }
            } else if (ch == 'I') {
                count += I;
            } else if (ch == 'V') {
                count += V;
            } else if (ch == 'X') {
                count += X;
            } else if (ch == 'L') {
                count += L;
            } else if (ch == 'C') {
                count += C;
            } else if (ch == 'D') {
                count += D;
            } else if (ch == 'M') {
                count += M;
            }
        }
        return count;

    }
}