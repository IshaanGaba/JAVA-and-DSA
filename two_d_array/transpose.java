package two_d_array;

public class transpose {
    public static void trans(int m[][]) {
        int t[][]=new int[m.length][m[0].length];
        for(int i=0;i<(m.length);i++){
            for(int j=0;j<(m[0].length);j++){
                t[j][i]=m[i][j];
                }
        }
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m[][]={{1,2,3},{5,6,7},{9,10,11}};
        trans(m);
    }
}
