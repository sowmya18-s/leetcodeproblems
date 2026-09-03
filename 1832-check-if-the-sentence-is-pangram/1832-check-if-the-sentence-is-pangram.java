class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr=new int[26];
        boolean ans=true;
        if(sentence.length()<26){
            ans=false;
            return ans;
        }
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return ans;
    }
}