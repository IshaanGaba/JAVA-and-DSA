package Divide_conquer;

public class merge {
    public static void merges(int a[],int p,int q,int r) {
        int n=q-p+1;
        int m=r-(q+1)+1;
        int R[]=new int[m];
        int L[]=new int[n];
        for(int i=0;i<n;i++){
            L[i]=a[p+i];
        }
        for(int i=0;i<m;i++){
            R[i]=a[q+1+i];
        }
        int i=0,j=0,k=p;
        while(i<n && j<m){
            if(R[j]>=L[i]){
                a[k]=L[i];
                i++;
            }
            else{
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<m){
            a[k]=R[j];
            j++;
            k++;
        }


    }
    public static void mergesort(int a[],int p,int r) {
        if(p>=r){
            return;
        }
        int q=p+(r-p)/2;
        mergesort(a, p, q);
        mergesort(a, q+1, r);
        merges(a, p, q, r);
    }
    public static void main(String[] args) {
        int a[]={2,5,1,3,4,6};
        mergesort(a, 0, a.length-1);//imp
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
