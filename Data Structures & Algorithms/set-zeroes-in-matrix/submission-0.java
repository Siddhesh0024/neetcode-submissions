class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        boolean[] zerorw=new boolean[n];
        boolean[] zerocol=new boolean[matrix[0].length];
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                int num=matrix[i][j];
                if(num==0){
                    zerorw[i]=true;
                    zerocol[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(zerorw[i]==true ||zerocol[j]==true){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
