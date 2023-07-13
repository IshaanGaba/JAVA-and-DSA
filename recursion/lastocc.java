package recursion;

public class lastocc {
    public static int last(int a[],int k,int i) {
        if(i==a.length){
            return -1;
        }
        int found=last(a, k, i+1);
        if(found==-1 && a[i]==k)
            return i;
        return found;
        // return last(a, k, i-1);
        
    }
    public static void main(String[] args) {
        int a[]={1,5,6,2,3,4,6,6};
        System.out.println(last(a, 6, 0));
    }
}
