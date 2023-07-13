package recursion;

public class pown {
    public static int oppow(int x,int n) {//optimised
        if(n==0){
            return 1;
        }
        int y=oppow(x, n/2);
        int z=y*y;
        if(n%2!=0){
            z=x*z;
            
        }
        return z;

    }
    public static int pow(int x,int n) {
        if(n==0){
            return 1;
        }
        return (x*pow(x,n-1));
    }
    
    public static void main(String[] args) {
        System.out.println(pow(2,10));
        System.out.println(oppow(2,8));
    }
}
