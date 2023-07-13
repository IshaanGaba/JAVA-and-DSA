package recursion;

public class findk{
    public static void find(int n[],int k,int i) {
        
        if(i==n.length){
            return;
        }
        
        if(n[i]==k){
            
            System.out.println(i);
        }
        find(n, k, i+1);

    }
    public static void main(String[] args) {
        int n[]={3,2,4,5,6,2,7,2,2};
        find(n, 2, 0);
    }
}