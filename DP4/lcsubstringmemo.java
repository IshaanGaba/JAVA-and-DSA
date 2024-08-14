package DP4;

import java.util.Arrays;

public class lcsubstringmemo {
    public int max=0;
    public int lcs(String s1,String s2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return dp[n][m]=0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            dp[n][m]=lcs(s1,s2,n-1,m-1,dp)+1;
            max=Math.max(dp[n][m],max);
            return dp[n][m];
        }
        return dp[n][m]=0;
    }
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                lcs(s1, s2, i, j, dp);
            }
        }
        return max;
    }
}
