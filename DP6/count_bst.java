package DP6;

public class count_bst {
    public static int catalan(int n) {
       int dp[]=new int[n+1];
       dp[0]=1; 
       dp[1]=1; 
       for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i]+=dp[j]*dp[i-1-j];
            }
       }
       return dp[n];
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        //how many bst can be formed
        int n=a.length;
        System.out.println(catalan(n));
    }
}
