package DP6;

public class wildcard_matching {
    public static boolean match(String s,String p) {
        boolean dp[][]=new boolean[s.length()+1][p.length()+1];
        //initiallize--3 Steps 
        dp[0][0]=true;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0]=false;
        }
        for (int i = 1; i < dp[0].length; i++) {
            if(p.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-1];
            }
            // else{
                
            //     dp[0][i]=false;
            // }  
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];//reduce both by one
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];//reduce each at a timeby1 
                }
                else{
                    dp[i][j]=false;//case when a!=b....
                }
            }
        }
        return dp[s.length()][p.length()];
    }
    public static void main(String[] args) {
        String s="baaabab";
        String p="*****ba*****ab";
        System.out.println(match(s, p));
    }
}
