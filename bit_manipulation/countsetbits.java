public class countsetbits {
    public static int count(int a) {
        int c=0;
        while(a>0){
            if((a&1)!=0){
                c++;
            }
            a=a>>1;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(count(16));
    }
}
