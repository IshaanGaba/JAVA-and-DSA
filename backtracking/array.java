public class array {
    public static void arr(int a[],int value,int i) {
        if(i==a.length){
            // System.out.println(a);
            return;
        }
        a[i]=value;
        arr(a,value+1,i+1);
        a[i]=a[i]-2;

    }
    public static void main(String[] args) {
        int a[]=new int[5];
        
        arr(a, 1, 0);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
