class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(str.toString());
                str=new StringBuilder();
            }
            else if(s.charAt(i)==')'){
                str.reverse();
                str=new StringBuilder(st.pop()+str.toString());
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}