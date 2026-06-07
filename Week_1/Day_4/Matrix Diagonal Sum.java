class Solution {
    public int diagonalSum(int[][] mat) {

        if (mat.length == 1)
            return mat[0][0];
        int sum = 0;
        int m = mat.length;

        for (int i = 0; i < m; i++) {
            sum += mat[i][i];
            sum += mat[i][m - 1 - i];
        }

        // Or

        // for(int i=0 ; i<m ;i++){
        // for(int j=0 ; j<m ;j++){
        // if(i==j){
        // sum+=mat[i][j];
        // }
        // if(i+j==m-1){
        // sum+=mat[i][j];
        // }
        // }
        //

        // for odd matrix minus the middle element as it is added twice
        if (m % 2 == 1) {
            sum -= mat[m / 2][m / 2];
        }
        return sum;
    }
}