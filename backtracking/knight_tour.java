public class knight_tour {
    // -----------or----------------
    public static boolean knight(int i,int j,int chess[][],int c) {
        if(i<0|| j<0 || i>=chess.length || j>=chess[0].length || chess[i][j]!=-1){
            return false;
        }
        if(c==(chess.length*chess.length-1)){
            chess[i][j]=c;
            print(chess);
            //chess[i][j] = -1;
            return true;
        }
        chess[i][j]=c;
        if (knight(i + 2, j + 1, chess, c + 1)) return true;
        if (knight(i + 1, j + 2, chess, c + 1)) return true;
        if (knight(i - 1, j + 2, chess, c + 1)) return true;
        if (knight(i - 2, j + 1, chess, c + 1)) return true;
        if (knight(i - 2, j - 1, chess, c + 1)) return true;
        if (knight(i - 1, j - 2, chess, c + 1)) return true;
        if (knight(i + 1, j - 2, chess, c + 1)) return true;
        if (knight(i + 2, j - 1, chess, c + 1)) return true;
        chess[i][j]=-1;
        return false;
    }
    public static boolean isSafe(int n,int visit[][],int i,int j) {
        if(i>=n || j>=n || i<0 || j<0 || visit[i][j]!=-1){
            return false;
        }
        return true;
    }
    public static void print(int visit[][]) {
        for (int i = 0; i < visit.length; i++) {
            for (int j = 0; j < visit[0].length; j++) {
                System.out.print(visit[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static boolean flag=false;
    public static void knight(int n,int visit[][],int i,int j) {
        if(flag){
            return;
        }
        if(visit[i][j]==(n*n)-1){
            print(visit);
            flag=true;
            return;
        }
        int row[]={2, 1, -1, -2, -2, -1, 1, 2};
        int col[]={1, 2, 2, 1, -1, -2, -2, -1};
        for (int k = 0; k < row.length; k++) {
            int nextI=i+row[k];
            int nextJ=j+col[k];
            if(isSafe(n, visit, nextI, nextJ)){
                visit[nextI][nextJ]=visit[i][j]+1;
                knight(n, visit, nextI, nextJ);
                visit[nextI][nextJ]=-1;

            }
        }
    }
    public static void main(String[] args) {
        int visit[][]=new int[5][5];
        for (int i = 0; i < visit.length; i++) {
            for (int j = 0; j < visit.length; j++) {
                visit[i][j]=-1;
            }
        }
        visit[0][0]=0;
        knight(5, visit, 0, 0);
    }
}
