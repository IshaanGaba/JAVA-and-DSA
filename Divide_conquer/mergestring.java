package Divide_conquer;

public class mergestring {
    public static boolean cmp(String s1,String s2) {
        if(s1.compareTo(s2)<0){
            return true;
        }
        return false;
    }
    public static void merge(String[] s,int p,int q,int r) {
        int m=q-p+1;
        int n=r-q;
        String L[]=new String[m];
        String R[]=new String[n];
        for(int i=0;i<m;i++){
            L[i]=s[p+i];
        }
        for(int i=0;i<n;i++){
            R[i]=s[q+1+i];
        }
        int i=0,j=0,k=p;
        while(i<m && j<n){
            if(cmp(L[i],R[j])){
                s[k]=L[i];
                i++;
                
            }
            else{
                s[k]=R[j];
                j++;
            }
            k++;
        }
        if(i<m){
            s[k]=L[i];
            k++;
            i++;
        }
        if(j<n){
            s[k]=R[j];
            k++;
            j++;
        }
    }
    public static void mergesort(String[] s,int p,int r) {
        if(p>=r){
            return;
        }
        int mid=p+(r-p)/2;
        mergesort(s, p, mid);
        mergesort(s, mid+1, r);
        merge(s,p,mid,r);
    }
    public static void main(String[] args) {
        String s[]={"sun","mars","earth","mercury"};
        mergesort(s, 0, s.length-1);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
