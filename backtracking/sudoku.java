public class sudoku {
    public static boolean solver(int s[][],int row ,int col) {
        //base
        if(row==s.length){
            return true;
        }
        //recursion
        int nextrow=row,nextcol=col+1;
        if(col+1==9){//-------------------------IMP-----------------------
            nextcol=0;
            nextrow=row+1;
        }
        if(s[row][col]!=0){
            return solver(s, nextrow, nextcol);

        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(s,row,col,digit)){
                s[row][col]=digit;
                if(solver(s, nextrow, nextcol)){
                    return true;
                }
                s[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int s[][],int row,int col,int digit) {
        //up-down
        for (int i = 0; i < s.length; i++) {
            if(s[i][col]==digit){
                return false;
            }
        }
        //right-left
        for (int i = 0; i < s.length; i++) {
            if(s[row][i]==digit){
                return false;
            }
        }
        //3*3
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for (int i = sr; i <sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {

                if(s[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void print(int b[][]) {
        System.out.println("------------------------------");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int s[][]={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        if(solver(s, 0, 0)){
            System.out.println("yes");
            print(s);
        }
        else{
            System.out.println("no");
        }
    }
}
