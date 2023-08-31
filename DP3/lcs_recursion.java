package DP3;
//longest common subsequence
public class lcs_recursion {
    public static int lcs(String s1,String s2,int n,int m,StringBuilder s) {
        if(n==0 || m==0){
            
            return 0;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            s.append(s1.charAt(n-1));
            
            return lcs(s1, s2, n-1, m-1, s)+1;
        }
        else{
            int ans1=lcs(s1, s2, n-1, m, s);
            int ans2=lcs(s1, s2, n, m-1, s);
            return Math.max(ans1, ans2);
        }
        
    }
    public static void main(String[] args) {
        String s1="abcdexg";
        String s2="abecg";
        System.out.println(lcs(s1,s2,s1.length(),s2.length(),new StringBuilder("")));

    }
}
