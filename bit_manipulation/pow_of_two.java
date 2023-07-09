public class pow_of_two {
    public static boolean pow2(int a) {
        if((a&(a-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(pow2(5));
    }
}
