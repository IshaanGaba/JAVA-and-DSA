package two_d_array;

public class transpose {
    public static void trans(int m[][]) {
        for(int i=0;i<m.length;i++){
            for(int j=i+1;j<m.length;j++){
                int t=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=t;
            }
        }
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m[][]={{1,2,3},{5,6,7},{9,10,11}};
        trans(m);
    }
}
