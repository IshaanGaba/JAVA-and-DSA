package DP4;
//insert,del,replace
public class edit_distance {
    public static int distance(String s1,String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        //initallize
        //when i=0 to covert i->j, j steps will be required and vice versa
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];//same h toh ek ek kamm kardo
                }
                else{
                    int add=dp[i][j-1];//add mei (i+1)ho gya and last wale toh mil gye now reduce both 
                    int del=dp[i-1][j];//del mei i mei se ek kamm ho gya
                    int replace=dp[i-1][j-1];
                    dp[i][j]=Math.min(add, Math.min(del, replace))+1;
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        String s1="intention";
        String s2="execution";
        System.out.println(distance(s1, s2));
    }
}
