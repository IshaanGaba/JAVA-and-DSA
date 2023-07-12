package recursion;

public class printn {
    public static void print(int n) {//decreasing
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);

        
    }
    public static void printi(int n) {//increasing
        if(n==1){
            System.out.println(n);
            return;
        }
        printi(n-1);
        System.out.println(n);       
}
    public static void main(String[] args) {
        print(5);
        System.out.println();
        printi(5);
    }
}
