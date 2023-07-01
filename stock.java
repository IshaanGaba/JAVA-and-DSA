// import java.util.*;
public class stock {
    public static int profit(int p[]) {
        //profit= sell-buy
        //sell should be max
        //buy -->min
        int n=p.length;
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<n;i++){
            if(p[i]>buy){
                int m=p[i]-buy;
                if (m>profit){
                    profit=m;
                }
                
            }
            else{
                buy=p[i];
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        int p[]={2,4,1}; 
        System.out.println(profit(p));
    }
}
