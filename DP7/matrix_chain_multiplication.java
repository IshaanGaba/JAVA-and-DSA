package DP7;

import java.util.Arrays;

public class matrix_chain_multiplication {
    static int count(int a[],int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=count(a,i,k,dp);
            int cost2=count(a,k+1,j,dp);
            int mycost=a[i-1]*a[k]*a[j];
            int finalcost=cost1+cost2+mycost;
            ans=Math.min(ans,finalcost);
        }
        return dp[i][j]=ans;
    }
    static int matrixMultiplication(int n, int arr[])
    {
        // code here
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return count(arr,1,n-1,dp);
    }
    public static void main(String[] args) {
        int arr[]={40,10,50,20,30};
        int n=5;
        matrixMultiplication(n, arr);
    }
}
