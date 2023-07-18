public class nqueen {
    public static void queen(char board[][],int row) {
        //base
        if(row==board.length){
            print(board);
            return;
        }

        //recursion
        for (int i = 0; i < board.length; i++) {
            //traversal in row-->col increasing
            if(isSafe(board,row,i)){
                board[row][i]='Q';

                queen(board, row+1);
                board[row][i]='x';

            
        }
    }
}
    public static boolean isSafe(char b[][],int row,int col) {
        //vertical up

        for(int i=row-1;i>=0;i--){
            if(b[i][col]=='Q'){
                return false;
            }
        }
        //left diagnol
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(b[i][j]=='Q'){
                return false;
            }
        }
        //right diagnol
        for(int i=row-1,j=col+1;i>=0 && j<b.length;i--,j++){
            if(b[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void print(char b[][]) {
        System.out.println("------------------------------");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        char b[][]=new char[4][4];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]='x';
            }
        }
        queen(b, 0);
    }
}

