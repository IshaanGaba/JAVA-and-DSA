package recursion;

public class cvtstring {
   
    public static void cvt(int n,StringBuilder s) {
     String d[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
       if(n<=0){
        
        return;
       }
       int rem=n%10;      
       cvt((n/10),s);
    //    s.append(d[rem]+" ");
    //     System.out.print(s+" ");
    System.out.print(d[rem]+" ");
       
        
    }
    public static void main(String[] args) {
        cvt(2019, new StringBuilder(""));
    }
}
