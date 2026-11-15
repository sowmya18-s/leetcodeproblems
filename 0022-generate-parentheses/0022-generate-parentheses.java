class Solution {
    public void generate(String curr,List<String> res,int open,int close,int n) {
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }
        if(open<n){
            generate(curr+'(',res,open+1,close,n);
        }
        if(close<open){
            generate(curr+')',res,open,close+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate("",res,0,0,n);
        return res;
    }
}