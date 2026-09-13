class Solution {
    public boolean isValidSudoku(char[][] board) {

        int r = board.length;
        int c = board[0].length;

        for(int i=0; i<r; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<c; j++){
                if(board[i][j] == '.'){
                        continue;
                }
                if(!set.add(board[i][j])){
                    return false;
                }
            }

        }


            for(int i=0; i<c; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<r; j++){
                if(board[j][i] == '.'){
                        continue;
                }
                if(!set.add(board[j][i])){
                    return false;
                }
            }

        }


        for(int i=0; i<6; i+=3){
            for(int j=0; j<6; j+=3){

              HashSet<Character> set = new HashSet<>();

              for(int x = i; x < i+3; x++){
                for(int y = j; y < j+3; y++ ){

                if(board[x][y] == '.'){
                    continue;
                }
                if(!set.add(board[x][y])){
                    return false;
                }

                }
              }


            }
        }

        return true;
        
    }
}
