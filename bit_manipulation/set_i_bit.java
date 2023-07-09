public class set_i_bit {
    public static int set(int a,int i) {//set ith bit to 1
        return a|(1<<i);
    }
    public static void main(String[] args) {
        System.out.println(set(10, 2));
    }
}
