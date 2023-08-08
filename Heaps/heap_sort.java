package Heaps;

public class heap_sort {
    public static void sort(int a[]) {
        int n=a.length;
        //build max heap
        for(int i=n/2;i>=0;i--){
            heapify(i,a,n);
        }
        //swap 1st and last
        for (int i = n-1; i >0; i--) {
            int t=a[0];
            a[0]=a[i];
            a[i]=t;
            
            heapify(0, a, i);
        }


    }
    public static void heapify(int i,int a[],int size) {
        int max=i;
        int left=2*i+1;
        int right=2*i+2;
        while(left<size && a[max]<a[left]){
            max=left;
        } 
        while(right<size && a[max]<a[right]){
            max=right;
        }
        if(max!=i){
            int t=a[i];
            a[i]=a[max];
            a[max]=t;
            heapify(max, a,size);
        } 
    }
    public static void main(String[] args) {
        int a[]={5,3,2,4,1};
        //ascending---max heap
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}