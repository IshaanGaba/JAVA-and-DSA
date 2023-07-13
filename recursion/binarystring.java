package recursion;

public class binarystring{
    public static void bin(int n,String s,int last) {
        if(n==0){
            System.out.println(s);
            return ;
        }
        bin(n-1,s+"0",0);
        if(last==0){
            bin(n-1,s+"1",1);
        }
    }
    public static void main(String[] args) {
        bin(2, "", 0);
    }
}