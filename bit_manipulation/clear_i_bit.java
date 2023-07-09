public class clear_i_bit {
    public static int clear(int a,int i) {//remove ith bit
        return a&(~(1<<i));
    }
    public static void main(String[] args) {
        System.out.println(clear(10, 1));
    }
}
