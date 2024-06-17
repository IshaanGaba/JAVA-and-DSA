package Divide_conquer;

public class inversioncount {
    public static int merge(int a[],int s,int e,int mid) {
        int c=0;
        int n=mid-s+1;
        int m=e-mid;
        int p[]=new int[n];
        int q[]=new int[m];
        for (int i = 0; i < p.length; i++) {
            p[i]=a[s+i];
        }
        for (int i = 0; i < q.length; i++) {
            q[i]=a[mid+1+i];
        }
        int i=0,j=0,k=s;
        while (i<p.length && j<q.length) {
            if(p[i]<=q[j]){
                a[k]=p[i];
                i++;
            }else{
                a[k]=q[j];
                c+=mid-s+1-i;
                j++;
            }
            k++;
        }
        while (i<p.length) {
            a[k]=p[i];
            i++;
            k++;
        }
        while (j<q.length) {
            a[k]=q[j];
            j++;
            k++;
        }
        return c;
    }
    public static int mergesort(int a[],int s,int e) {
        int c=0;
        if(s>=e){
            return c;
        }
        int mid=s+(e-s)/2;
        c+=mergesort(a, s, mid);
        c+=mergesort(a, mid+1, e);
        c+=merge(a, s, e, mid);
        return c;
    }
    public static void main(String[] args) {
        int a[]={3,5,6,9,1,2,7,8};
        System.out.println(mergesort(a, 0,a.length-1));
    }
}
