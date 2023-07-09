public class update_i {
    public static int clear(int a,int i) {//remove ith bit
        return a&(~(1<<i));
    }
    public static int update(int a,int i,int n) {//n-0 or n 1
        // if(n==0){
        //     return clear_i_bit(a,i);
        // }
        // else{
        //    return set_i_bit(a,i); 
        // }
        a=clear(a,i);
        int bitmask=n<<i;
        return a|bitmask;

    }
    
    public static void main(String[] args) {
        System.out.println(update(10,2,1));
    }
}
