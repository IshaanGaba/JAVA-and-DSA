package DP7;

import java.util.Arrays;

public class min_jumps {//tle
    public static int minJumps(int[] arr) {
        // your code here
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        dp[arr.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            int steps=arr[i];
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<arr.length;j++){
                if(dp[j]!=-1){
                    min=Math.min(min,dp[j]+1);
                }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min;
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int a[]={2,3,1,1,4};
        System.out.println(minJumps(a));
    }
}
