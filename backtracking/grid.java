public class grid {
    public static int way(int m,int n,int row,int col) {
        if(row==m-1 && col==n-1){
            return 1;
        }
        else if(row==m || col==n ){
            return 0;
        }
        
        int w1=way(m,n,row+1, col);//down
        int w2=way(m,n,row, col+1);//right
        return w1+w2;
    }
    public static int fact(int n) {
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int pnc(int row,int col) {
        int m=fact(row-1+col-1);
        int r=fact(row-1);
        int c=fact(col-1);
        return m/(r*c);
    }

    public static void main(String[] args) {
        System.out.println(way(3, 3, 0, 0));
        System.out.println(pnc(3, 3));
    }
}
