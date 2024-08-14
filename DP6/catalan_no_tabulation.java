package DP6;
//o(n^2)
public class catalan_no_tabulation {
    // IMP---------------gfg long dikkat
    final static int MOD=(int)Math.pow(10,9)+7;
    public static int findCatalan(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                long product = 1L * dp[j] * dp[i - j - 1]; // This ensures the multiplication is done using long.
                int modProduct = (int)(product % MOD); // Then take modulo and cast back to int.
                dp[i] = (dp[i] + modProduct) % MOD; // Accumulate and take modulo immediately
                
            }
            
        }
        return dp[n];
    }
    public static int catalan(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(catalan(5));
    }
}
