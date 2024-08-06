package DP2;
//O(n*target)
public class target_sum_subset{
    public static boolean target_sum(int n[],int target) {
        boolean dp[][]=new boolean[n.length+1][target+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=true;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(n[i-1]<=j && dp[i-1][j-n[i-1]]==true){//include
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
                //OR-------------
                // if(n[i-1]<=j){
                //     dp[i][j]=dp[i-1][j-n[i-1]]||dp[i-1][j];//include or exclude
                // }else{
                //     dp[i][j]=dp[i-1][j];
                // }
            }
        }
        return dp[n.length][target];
    }
    public static void main(String[] args) {
        int n[]={4,2,7,1,3};
        int target=10;
        System.out.println(target_sum(n,target));
    }
}