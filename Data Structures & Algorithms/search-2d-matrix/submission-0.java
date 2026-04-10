class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x =0;
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length ; j++){
                if (matrix[i][j] == target){
                    x=1;
                }
            }
        }
        if (x==1) return true;
        else return false;
    }
}
