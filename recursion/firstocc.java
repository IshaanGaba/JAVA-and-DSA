package recursion;

public class firstocc {
    public static int first(int a[],int k,int i) {
        if(i==a.length){
            return -1;
        }
        if(a[i]==k){
            return i;
        }
        return first(a,k,i+1);
    }
    public static void main(String[] args) {
        int a[]={1,3,4,12,5,12};
        System.out.println(first(a,2,0));
    }
}
