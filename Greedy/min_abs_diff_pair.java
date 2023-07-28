package Greedy;
//for 2 nos,diff is min when the 2 nos. are close to each other
import java.util.Arrays;
public class min_abs_diff_pair {//need to add all min diff
    public static int diff(int a[],int b[]) {
        Arrays.sort(a);        
        Arrays.sort(b);
        int dif=0;
        for (int i = 0; i < b.length; i++) {
            dif+=Math.abs(a[i]-b[i]);
        }
        return dif;        
    }
    public static void main(String[] args) {
        int a[]={4,1,8,7};
        int b[]={2,3,6,5};
        System.out.println(diff(a, b));
    }
}
