package DP3;

public class rod_cutting {
    public static int profit(int piece[],int price[],int total) {
        int dp[][]=new int[piece.length+1][total+1];
        //initally all zero
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(piece[i-1]<=j){
                    int ans1=price[i-1]+dp[i][j-piece[i-1]];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1, ans2);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[piece.length][total];
    }
    public static void main(String[] args) {
        int piece[]={1,2,3,4,5,6,7,8};
        int total=8;
        int price[]={1,5,8,9,10,17,17,20};
        System.out.println(profit(piece, price, total));
    }
}
