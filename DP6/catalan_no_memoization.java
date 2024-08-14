package DP6;

import java.util.Arrays;
//o(n^2)
public class catalan_no_memoization {
    //IMP-------------------------gfg catalan no.
    final static int MOD=(int)Math.pow(10,9)+7;
    public static int c(int n,int dp[]){
        if(n==0 || n==1){
            return dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            long product = (long) c(i, dp) * c(n - i - 1, dp) % MOD;
            sum = (int) ((sum + product) % MOD);
        }
        return dp[n]=sum;
    }
    public static int findCatalan(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return c(n,dp);
    }
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
