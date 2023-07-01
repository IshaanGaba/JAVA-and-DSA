package sort;

public class selection{
    public static void selectionsort(int a[]) {
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(a[small]>a[j]){
                    small=j;
                }
            }
            int t=a[small];
            a[small]=a[i];
            a[i]=t;
        }
    }
    public static void main(String[] args) {
        int a[]={5,4,1,2,3};
        selectionsort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}