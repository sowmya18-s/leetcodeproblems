class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int m=mat.length;
        int n=mat[0].length;

        int low=0,high=n-1;

        while(low<=high){

            int mid=(low+high)/2;

            int maxrow=0;

            for(int i=0;i<m;i++){
                if(mat[i][mid]>mat[maxrow][mid]){
                    maxrow=i;
                }
            }

            int left=-1;
            if(mid>0){
                left=mat[maxrow][mid-1];
            }

            int right=-1;
            if(mid<n-1){
                right=mat[maxrow][mid+1];
            }

            if(mat[maxrow][mid]>left && mat[maxrow][mid]>right){
                return new int[]{maxrow,mid};
            }

            else if(left>mat[maxrow][mid]){
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }

        return new int[]{-1,-1};
    }
}