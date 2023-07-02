package sort;

public class desall {
    public static void bubble(int a[]) {
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){//condition change here only
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
             }
        }
    }
    public static void selection(int a[]) {
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]<a[j]){//condition change here only
                    min=j;
                }
            }
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
    }
    public static void insertion(int a[]) {
        int n=a.length;
        for(int i=1;i<n;i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]<curr){//condition change here only
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }
    public static void count(int a[]) {
        int n=a.length;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            large=Math.max(large, a[i]);
        }
        int count[]=new int[large+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){//condition change here only
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={3,6,2,1,8,7,4,5,3,1};
        // bubble(a);
        // selection(a);
        // insertion(a);
        count(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
