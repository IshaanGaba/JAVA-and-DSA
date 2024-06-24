public class reverse{
    public static void rev(int a[]) {
        for (int i = 0; i < a.length/2; i++) {
            int t=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=t;
        }
    }
    public static void main(String[] args) {
       int a[]={1,2,3,4};
       rev(a); 
       for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
       }
    }
}