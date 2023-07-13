package recursion;

public class fibanocci {
    public static int fab(int n) {
        if(n==0 || n==1){
            return n;
        }
        int f=(fab(n-1)+fab(n-2));
        return(f); 
    }
    public static void main(String[] args) {
    System.out.println(fab(5));    
    //nth fibaonnaci no.
}

}
