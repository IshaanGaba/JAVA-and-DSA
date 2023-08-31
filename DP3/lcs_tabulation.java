package DP3;

public class lcs_tabulation {
    public static int lcs(String s1,String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        //initally all 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i][j-1];//second mei se 1 hatta diya
                    int ans2=dp[i-1][j];//first mei se 1 hatta diya
                    dp[i][j]=Math.max(ans1, ans2);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        String s1="abcdexg";
        String s2="dagx";
        System.out.println(lcs(s1,s2));

    }
}
