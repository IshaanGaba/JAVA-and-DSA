package DP6;

import java.util.Arrays;

public class catalan_no_memoization {
    public static int catalan(int n,int dp[]) {
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;
        if(dp[n]!=-1){
            return dp[n];
        }
        for (int i = 0; i < n; i++) {
            ans+=catalan(i, dp)*catalan(n-i-1, dp);
            dp[n]=ans;
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalan(n, dp));
    }
}
