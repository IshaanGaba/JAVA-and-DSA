package DP2;

public class zero_one_knapsack_recur {
    public static int knapsack(int val[],int wt[],int W,int n) {
        if(W==0 || n==0){
            return 0;
        }
        
        if(wt[n-1]<=W){
            //include
            int ans1=val[n-1]+knapsack(val, wt, W-wt[n-1], n-1);
            //exclude 
            int ans2=knapsack(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        }
        else{
            return knapsack(val, wt, W, n-1);
        }
        
    }
    public static void main(String[] args) {
        int val[]={60, 100, 120};
        int wt[]={10, 20, 30};
        int W=50;
        System.out.println(knapsack(val, wt, W, 3));

    }
}
