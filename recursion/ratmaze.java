package recursion;

public class ratmaze {
    // public static int c=0;
    public static int totalways(int n,int m,int i,int j) {
        if(i==n-1 && j==m-1){
           
            return 1;
        }
        if(i==n || j==m){
            return 0;
        }
        int y=totalways(n, m, i+1, j);
        int x=totalways(n, m, i, j+1);
        return x+y;
        
    }
    public static void main(String[] args) {
        System.out.println(totalways(3,3, 0, 0));
    }
}
