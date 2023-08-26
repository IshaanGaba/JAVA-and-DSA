package DP1;

public class fib_memoization {//O(n)
    public static int fib(int n,int dp[]) {
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=fib(n-1, dp)+fib(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=6;
        int dp[]=new int[n+1];//0..6
        System.out.println(fib(n,dp));
    }
}
