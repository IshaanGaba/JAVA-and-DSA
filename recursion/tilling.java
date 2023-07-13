package recursion;

public class tilling {
    public static int ways(int n) {
        if(n==0 || n==1)
            return 1; 
        //vertical
        int v=ways(n-1);
        //horizontal
        int h=ways(n-2);
        return v+h;
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
