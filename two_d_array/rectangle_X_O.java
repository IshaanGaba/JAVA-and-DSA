package two_d_array;
// Write a code which inputs two numbers m and n and creates a matrix of size m x n (m rows and n columns) in which every elements is either X or 0. The Xs and 0s must be filled alternatively, the matrix should have outermost rectangle of Xs, then a rectangle of 0s, then a rectangle of Xs, and so on.
// Input: m = 3, n = 3
// Output: Following matrix 
// X X X
// X 0 X
// X X X

// Input: m = 4, n = 5
// Output: Following matrix
// X X X X X
// X 0 0 0 X
// X 0 0 0 X
// X X X X X


//code neeche h--------------do urself first

public class rectangle_X_O {
    public static void pattern(int m,int n) {
        char a[][]=new char[m][n];
        int c=0;
        int sr=0,sc=0,er=m-1,ec=n-1;
        while (sc<=ec && sr<=er) {
            if(c%2==0){
                for (int i = sc; i <= ec; i++) {
                    a[sr][i]='X';
                }
                for (int i = sr+1; i <= er; i++) {
                    a[i][ec]='X';
                }
                for (int i = ec-1; i >= sc; i--) {
                    if(sr==er){
                        break;
                    }
                    a[er][i]='X';
                }
                for (int i = er-1; i >= sr+1; i--) {
                    if(sc==ec){
                        break;
                    }
                    a[i][sc]='X';
                }
            }else{
                for (int i = sc; i <= ec; i++) {
                    a[sr][i]='O';
                }
                for (int i = sr+1; i <= er; i++) {
                    a[i][ec]='O';
                }
                for (int i = ec-1; i >= sc; i--) {
                    if(sr==er){
                        break;
                    }
                    a[er][i]='O';
                }
                for (int i = er-1; i >= sr+1; i--) {
                    if(sc==ec){
                        break;
                    }
                    a[i][sc]='O';
                }
            }
            c++;
            sc++;
            sr++;
            ec--;
            er--;
            
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern(6,7);
    }
}
