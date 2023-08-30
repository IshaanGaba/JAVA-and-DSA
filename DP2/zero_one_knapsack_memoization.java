package DP2;
//O(n*W)
public class zero_one_knapsack_memoization {
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int knapsack(int val[],int wt[],int W,int dp[][],int n) {
        // i--items and j--weight
        if(n==0 || W==0){
            dp[n][W]=0;
            return dp[n][W];
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            dp[n][W]= Math.max(val[n-1]+knapsack(val, wt, W-wt[n-1], dp, n-1), knapsack(val, wt, W, dp, n-1));
        }
        else{

            dp[n][W]= knapsack(val, wt, W, dp, n-1);       
        }
        
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[val.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j  = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsack(val, wt, W,dp,val.length));
        // print(dp);
    }
}
