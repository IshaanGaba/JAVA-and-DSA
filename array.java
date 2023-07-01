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
            x=Math.max(x, a[i]);
            y=Math.min(y, a[i]);
        }
        System.out.println(y);
        return x;
    }
    public static int bsrch(int a[],int k) {
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(a[m]==k){
                return m;
            }
            else if(a[m]<k){
                s=m+1;
            }
            else{
                e=m-1;
            }

        }
        return 0;

    }
    
    public static void reverse(int a[]) {
        int s=0;
        int e=a.length-1;
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={-5,20,-30,15,96};
        // int x=lsrch(a, 6);
        // System.out.println(x);
        // int x=large(a);
        // System.out.println(x);
        System.out.println(bsrch(a, 15));
        reverse(a);
    }
    
}