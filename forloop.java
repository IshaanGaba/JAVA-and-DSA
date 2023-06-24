import java.util.*; //imp-->reverse,odd,evensum

public class forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int c=1;

        //print 1 to 10
        /*while(c<=10){
            System.out.print(c+" ");
            c++;
        }*/

        //sum of 1 to n
        // System.out.print(" enter n ");
        // int n=sc.nextInt();
        // int s=0;
        // while(c<=n){
        //     s=s+c;
        //     c++;
        // }
        // System.out.print(s+" is the sum ");
        
        // print reverse
        // int n=1234567890;
        // int l;
        // while(n>0){
        //     l=n%10;
        //     System.out.print(l);
        //     n=n/10;

        // }

        //restore reverse 
        // int n=1234567890;
        // int l,r=0;
        // while(n>0){
        //     l=n%10;
        //     r=(r*10)+l;
        //     n=n/10;
        // }
        // System.out.println(r);
        
        //prime or not
        // int a=sc.nextInt();
        // int f=0;
        // for(int i=2;i<=a/2;i++){
        //     if(a%i==0){
        //         f=1;
        //         break;
        //     }
        // }
        // if(f==1){
        // System.out.println("not p");
        // }
        // else{
        // System.out.println("p");
        // }
        
        //odd even int sum
        // int n;
        // int c=1;
        // int se=0;
        // int so=0;
        // do{
        //     n=sc.nextInt();
        //     if(n%2==0){
        //         se=se+n;
        //     }
        //     else{
        //         so=so+n; 
        //     }
        //     c=sc.nextInt();
        // }while(c==1);
        // System.out.println("o "+so);       
        // System.out.println("e "+se);
        
        //factorial
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("f "+fact);

        sc.close();
    }
}
