class Solution {
    public boolean isAnagram(String s, String t) {
    boolean ans=true;
    if(s.length()!=t.length()){
        ans=false;
		 return ans;
	}
	int[] arr1=new int[26];
	int[] arr2=new int[26];
	for(int i=0;i<s.length();i++){
		  arr1[s.charAt(i)-'a']++;
		  arr2[t.charAt(i)-'a']++;
	}
	for(int i=0;i<arr1.length;i++){
		if(arr1[i]!=arr2[i]){
		  return false;
	}
	
   }
   return ans;
        
    }
}