package sort;

public class bubble {
    public static void bubblesort(int a[]) {
        int n=a.length;
      for(int i=0;i<n-1;i++){
        int flag=0;
        for(int j=0;j<n-1-i;j++){
            if(a[j]>a[j+1]){
                flag=1;
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
            

        }
        if(flag==0){
            break;
        }
        // System.out.println(flag);  
      }
      
    }
    public static void main(String[] args) {
        int a[]={1,2,3,5,4};
        bubblesort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
