package DP7;

public class tabulation_mcm {
    public static int matrixMultiplication(int n, int arr[])
    {
        // code here
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }
        for(int len=2;len<n;len++){//how many matrix at a time
            for(int i=1;i<=n-len;i++){//row
                int j=len+i-1;//col
                int ans=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1=dp[i][k];
                    int cost2=dp[k+1][j];
                    int mycost=arr[i-1]*arr[k]*arr[j];
                    int finalcost=cost1+cost2+mycost;
                    ans=Math.min(ans,finalcost);
                }
                dp[i][j]=ans;
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int arr[]={40, 20, 30, 10, 30};
        int n=5;
        System.out.println(matrixMultiplication(n, arr));
    }
}
