package recursion;

public class firstlastocc {
    public static int first=-1;
    public static int last=-1;
    public static void occurence(int a[],int i,int key) {
        if(i==a.length){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(a[i]==key){
            if(first==-1){
                first=i;
            }else{
                last=i;
            }
        }
        occurence(a, i+1, key);
    }
    public static void main(String[] args) {
        int a[]={1,4,5,6,9,8,7,4,2,3,6,4,6};
        occurence(a, 0, 4);
    }
}
