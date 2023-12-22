package two_d_array;

public class spiral {
    public static void spiral_matrix(int m[][]) {
        int sr=0,sc=0,er=m.length-1,ec=m[0].length-1;
        while(sr<=er && sc<=ec){
            //top
            for(int j=sc;j<=ec;j++){
                System.out.print(m[sr][j]+" ");
            }
            //right
            for(int i=sr+1;i<=er;i++){
                System.out.print(m[i][ec]+" ");
            }
            //bottom
            for(int j=ec-1;j>=sr;j--){
                if(sr==er){//so that the middle no. whne odd matrix rows/cols does not repeated
                    break;
                }
                System.out.print(m[er][j]+" ");
            }
            //left
            for(int i=er-1;i>sr;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(m[i][sc]+" ");
            }
            sc++;
            ec--;
            sr++;
            er--;
        }
    }
    public static void main(String[] args) {
        int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral_matrix(m);

    }
}
