package Divide_conquer;

public class quick {
    public static int partition(int a[],int p,int r) {
        int x=a[r];
        int i=p-1;
        for(int j=p;j<r;j++){
            if(a[j]<=x){
                i++;
                int t=a[j];
                a[j]=a[i];
                a[i]=t;
            }
        }
        i++;
        int t = a[r];
        a[r]=a[i];//if we use x instead of a[r],changes will be made in temporary variable and not the actual array
        a[i] = t;
        return i;
    }
    public static void quicksort(int a[],int p,int r) {
        if(p>=r){
            return;
        }
        int q=partition(a, p, r);
        quicksort(a, p, q-1);
        quicksort(a, q+1, r); 
    }
    public static void main(String[] args) {
        int a[]={2,5,1,3,4,6};
        quicksort(a, 0, a.length-1);//imp
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
