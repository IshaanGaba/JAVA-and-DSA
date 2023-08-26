package DP1;

import java.util.Arrays;

public class climb_stair_memoization {
    public static int count(int n,int dp[]) {
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=count(n-1, dp)+count(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);//initialize all to -1 instead of 0
        System.out.println(count(n,dp));
    }
}
