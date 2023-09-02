package DP6;

public class catalan_no_recursion{
    public static int catalan(int n) {
        int ans=0;
        if(n==0 || n==1){
            return 1;
        }
        
        for (int i = 0; i < n; i++) {
            ans+=catalan(i)*catalan(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(catalan(n));
    }
}