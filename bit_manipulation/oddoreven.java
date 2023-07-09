
public class oddoreven {
    public static String oe(int a) {
        if((a&1) !=1){//the last digit of odd is always 1 and even is 0 check eg
            return "even"; 
        }
        return "odd"; 
    }
    public static void main(String[] args) {
        System.out.println(oe(101));
        System.out.println(oe(100));
        System.out.println(oe(1001));
        System.out.println(oe(1010));
    }
}
