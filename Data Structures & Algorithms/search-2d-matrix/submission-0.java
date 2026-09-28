class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        
        int row = mat.length;
        int col = mat[0].length;
        int l=0, h=row*col-1;

        while(l <= h){
            int mid = (l+h)/2;

            int r = mid/col;
            int c = mid%col;

            if(mat[r][c] == tar) return true;

            else if(mat[r][c] > tar){
                    h = mid - 1;
            }
            else{
                    l = mid + 1;
            }
        }
        return false;
    }
}
