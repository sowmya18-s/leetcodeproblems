class Solution {
    public String frequencySort(String s) {
        int[] a=new int[128];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
        }
        StringBuilder sb=new StringBuilder();
        while(sb.length()<s.length()){
            int max=0;
            int index=0;
            for(int i=0;i<a.length;i++){
                if(a[i]>max){
                    max=a[i];
                    index=i;
                }
            }
            if (max == 0) {
                break;
            }
            for(int i=0;i<max;i++){
                sb.append((char)index);
            }
            a[index]=0;
        }
        return sb.toString();
    }
}