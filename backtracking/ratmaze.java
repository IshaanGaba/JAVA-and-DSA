
public class ratmaze {
    public static void rat(int m[][],int visited[][],int row,int col) {
         if(m[0][0]==0){
            System.out.println("no");
            return;
        }
        if(row==m.length-1 && col==m.length-1){
            visited[row][col]=1;
            print(visited);
            return;
        }
        

        //down
        if(isSafe(m,visited,row+1,col)){
            visited[row][col]=1;
            rat(m, visited, row+1, col);
            visited[row][col]=0;

        }
        //left
        if(isSafe(m,visited,row,col-1)){
            visited[row][col]=1;
            rat(m, visited, row, col-1);
            visited[row][col]=0;

        }
        //right
        if(isSafe(m,visited,row,col+1)){
            visited[row][col]=1;
            rat(m, visited, row, col+1);
            visited[row][col]=0;

        }
        //up
        if(isSafe(m,visited,row-1,col)){
            visited[row][col]=1;
            rat(m, visited, row-1, col);
            visited[row][col]=0;

        }
    }
    public static boolean isSafe(int m[][],int visited[][],int row,int col) {
        if((row>=0 && row<m.length)&&(col>=0 && col<m.length) && visited[row][col]!=1 && m[row][col]==1){
            return true;
        }
        return false;
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
        int m[][]={{1,0,0,0},{1,1,0,0},{1,1,0,0},{0,1,1,1}};
       
        int visited[][]=new int[4][4];
        rat(m, visited, 0, 0);
    }
}
