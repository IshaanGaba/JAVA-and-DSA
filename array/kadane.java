package array;
//this does not work for all -ve no.
public class kadane {
    public static int kadanesum(int a[]) {
        int n=a.length;
        int cs=0;//current sum
        int ms=Integer.MIN_VALUE;//max sum
        for(int i=0;i<n;i++){
            cs+=a[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        return ms;
    }
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadanesum(a));
    }
    
}
