package DP2;
//each item can be used any no. of time
public class unbounded_knapsack {
    public static int knapsack(int val[],int wt[],int W) {
        int dp[][]=new int[val.length+1][W+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(wt[i-1]<=j){
                    //include mei any no. of items
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else{//exclude mei i-1...
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[val.length][W];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(knapsack(val, wt, W));
    }
}
