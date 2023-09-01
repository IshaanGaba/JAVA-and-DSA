package DP4;
//insert and delete
public class string_conversion {
    public static int lcs(String s1,String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1, ans2);
                }
                
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public static int count(String s1,String s2) {
        int k=lcs(s1,s2); 
        
        int ans1=s1.length()-k;//del
        int ans2=s2.length()-k;//add
        return ans1+ans2;
    }
    public static void main(String[] args) {
        String s1="abcdef";
        String s2="aceg";
        System.out.println(count(s1, s2));
    }
}
