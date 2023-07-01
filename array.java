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
    // public static int profit(int p[]) {-->{2,4,1}
    //     //profit= sell-buy
    //     //sell should be max
    //     //buy -->min
    //     int n=p.length;
    //     int x=-1;
    //     int buy=Integer.MAX_VALUE;
    //     for(int i=0;i<n;i++){
    //         if(p[i]<buy){
    //             buy=p[i];
    //             x=i;
    //         }
    //     }
    //     int profit=Integer.MIN_VALUE;
    //     for(int i=x;i<n;i++){
    //         int z=p[i]-buy;
    //         profit=Math.max(z, profit);
    //     }

    //     return profit;
    // }
    public static void main(String[] args) {
        int a[]={10,-5,20,-30,15,96};
        // int x=lsrch(a, 6);
        // System.out.println(x);
        int x=large(a);
        System.out.println(x);
    }
    
}