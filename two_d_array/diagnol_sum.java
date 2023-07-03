package two_d_array;

public class diagnol_sum {
    public static int sum(int m[][]) {//o(n)
        int s=0;
        for(int i=0;i<m.length;i++){
            s+=m[i][i];
            if(i!=m.length-i-1){
                s+=m[i][m.length-i-1];
            }
            else{
                s+=m[i][m.length-i-1];
            }
        }
        return s;
    }
    public static int sum1(int m[][]) {//o(n^2)
        int s=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j){//primary diagnol
                    s+=m[i][j];
                }
                //secondary diagnol
                if(i+j==m.length-1){
                    s+=m[i][j];       
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int m[][]={{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(sum1(m));
        System.out.println(sum(m));

    }
}
