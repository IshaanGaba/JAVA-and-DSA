package DP1;

public class climb_stair_recur {
    public static int count(int n) {
        if(n==0){
            return 1;// 1 way
        }
        if(n<0){
            return 0;
        }
        return count(n-1)+count(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(count(n));
    }
}
