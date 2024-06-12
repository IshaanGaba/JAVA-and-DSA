package array;

public class rotatebsrch {
    public static int rotate(int a[],int k) {
        int e=0,s=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i]<a[i-1]){
                s=i;
                break;
            }
        }
        e=--s;
        if(e==-1){
            e=a.length-1;
        }
        int mid=s+(e-s)/2;
        if(a[mid]==k){
            return mid;
        }
        else
    }
    public static void main(String[] args) {
        
    }
}
