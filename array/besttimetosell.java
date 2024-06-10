package array;

public class besttimetosell {
    public static int buy(int a[]) {
        int profit=0;
        int b=a[0];
        for (int i = 1; i < a.length; i++) {
            if(b>a[i]){
                b=a[i];
            }
            else{
                profit=Math.max(profit,a[i]-b);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        System.out.println(buy(a));
    }
}
