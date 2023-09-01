package DP4;

public class longest_common_substring {
    public static int lcs(String s1,String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        int ans=0;//to find out max length may or may not be at last

        //initailly all 0
        //initallize 0 when i=0
        //initallize 0 when j=0
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans, dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String s1="adefgh";
        String s2="abdfgh";
        System.out.println(lcs(s1, s2));
    }
}
