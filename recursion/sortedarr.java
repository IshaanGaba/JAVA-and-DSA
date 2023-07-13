package recursion;

public class sortedarr {
    public static boolean sorted(int a[],int i) {
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return sorted(a,i+1);
    }
    public static void main(String[] args) {
        int a[]={1,12,3,4,5};
        System.out.println(sorted(a,0));
        
    }
}
