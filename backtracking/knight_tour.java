public class knight_tour {
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
