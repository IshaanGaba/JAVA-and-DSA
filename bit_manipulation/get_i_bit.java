public class get_i_bit {
    public static int i_bit(int a,int i) {
        int b=1<<i;
        if((a & b )==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(i_bit(15, 2));//pass integer
    }
}
