import java.util.*;
public class array {
    public static int lsrch(int a[],int k) {
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static int large(int a[]) {
        int x=Integer.MIN_VALUE;
        int y=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(x<a[i]){
                x=a[i];
            }
            if(y>a[i]){
                y=a[i];
            }
        }
        System.out.println(y);
        return x;
    }
    
    public static void main(String[] args) {
        int a[]={10,-5,20,-30,15,96};
        // int x=lsrch(a, 6);
        // System.out.println(x);
        int x=large(a);
        System.out.println(x);
    }
    
}