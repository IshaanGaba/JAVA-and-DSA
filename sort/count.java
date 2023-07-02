package sort;

public class count {
    public static void countsort(int a[]) {
        int l=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            l=Math.max(l, a[i]);
        }
        int count[]=new int[l+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,4,3,2,1,7,6,5};
        countsort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
