
public class clear_last__i{
    public static int cleari(int a,int i) {
        return a&((~0)<<i);
    }
    public static void main(String[] args) {
        System.out.println(cleari(15, 2));
    }
}