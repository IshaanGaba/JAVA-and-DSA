package recursion;
//new copy
public class titleproblemdiff {
    public static int totalways(int n,int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        return totalways(n-1,m)+totalways(n-m, m);
    }
    public static void main(String[] args) {
        System.out.println(totalways(4, 2));
    }
}
