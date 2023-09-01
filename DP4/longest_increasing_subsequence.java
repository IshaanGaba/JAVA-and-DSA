package DP4;

import java.util.Arrays;
import java.util.HashSet;

public class longest_increasing_subsequence{
    public static int lcs(int a[],int arr2[]) {
        int dp[][]=new int[a.length+1][arr2.length+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(a[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1, ans2);
                }
            }
        }
        return dp[a.length][arr2.length];
    }
    public static int lis(int a[]) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int arr2[]=new int[set.size()];
        int i=0;
        for (Integer num : set) {//unique elements to arr2
            arr2[i]=num;
            i++;
        }
        Arrays.sort(arr2);//sort in ascending order
        return lcs(a,arr2);
    }
    public static void main(String[] args) {
        int a[]={40,3,10,7,50,80};
        System.out.println(lis(a));
    }
}