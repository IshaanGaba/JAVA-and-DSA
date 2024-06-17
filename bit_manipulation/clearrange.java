public class clearrange {
    
    public static int clearr(int n,int i,int j) {
        int a=((~0)<<(j+1));
        int b=((1<<i)-1);
        return n&(a|b);
    }
    public static void main(String[] args) {
        System.out.println(clearr(63,2,4));
    }
}

