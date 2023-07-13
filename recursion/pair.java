package recursion;

public class pair {
    public static int ways(int n) {
        if(n==0 || n==1 ||n==2){
            return n;
        }
        //1
        int x=ways(n-1);
        //pair
        int y=(n-1)*ways(n-2);//imp
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}
