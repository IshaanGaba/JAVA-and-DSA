package DP1;

public class climb_stair_tabulation {//O(n)
    public static int count(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        for (int i = 1; i < dp.length; i++) {
            if(i==1){
                dp[i]=dp[i-1]+0;// 0 for -ve nos.
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(count(n));
    }
}
