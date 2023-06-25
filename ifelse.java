import java.util.*; //leapyr imp
public class ifelse {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("a: ");
        int a=sc.nextInt();
        System.out.println("b: ");
        // int b=sc.nextInt();

        //largest of 2
        /*if(a>=b){
            System.out.println('a');
        }
        else{
            System.out.println('b');
            
        }*/
        
        //even or odd
       /* if(a%2==0){
            System.out.println("even"+a);
            
        }
        else{
            System.out.println("odd"+b);
            
        }
        */
        //largest of 3
        // int c=sc.nextInt();
        // if(a>=b && a>=c){
        //     System.out.println("a");
            
        // }
        // else if(b>=c){
        //     System.out.println("b");
            
        // }
        // else{

        //     System.out.println("c");
        // }

        
        //     tax kitna
        // if(a>=120000){
        //     b=(int)(0.3*a);
        // }
        // else if(a>300000 && a<120000){
        //     b=(int)(0.2*a);
        // }
        // else{
        //     b=0;
        // }
        // System.out.println("tax is "+b);
        
        //ternary
        // String c=(a>=33)?"pass":"not pass";
        // System.out.println("is "+c);
        
        //switch
        // char c=sc.next().charAt(0);
        // switch(c){
        //     case '+':System.out.println("is "+(a+b));break;
        //     case '-':System.out.println("is "+(a-b));break;
        //     case '*':System.out.println("is "+(a*b));break;
        //     case '/':System.out.println("is "+(a/b));break;
        //     default:System.out.println("wrong");
        // }
        
        //+ve or -ve
        // if(a<0){
        //     System.out.println("is -ve "+a);
            
        // }
        // else if(a==0){
        //     System.out.println("is 0 "+a);
            
        // }
        // else{

        //     System.out.println("is +ve "+a);
        // }
        
        //temp
        // double temp=10.5;
        // if(temp>100){
        //     System.out.println("is +ve "+temp); 
        // }
        // else{
        //     System.out.println("is -ve "+temp);
        // }

        //week
        switch(a){
            case(1):System.out.println("is mon");break;
            case(2):System.out.println("is tues");break;
            case(3):System.out.println("is wednes");break;
            case(4):System.out.println("is thurs");break;
            case(5):System.out.println("is fri");break;
            case(6):System.out.println("is sat");break;
            case(7):System.out.println("is sun");break;
            default:System.out.println("wrong");
        }

        //leap yr
        boolean x=(a%4==0);
        boolean y=(a%100!=0);
        boolean z=(a%100==0)&&(a%400==0);
        if(x && (y||z)){
            System.out.println("leap");
        }
        else{
            System.out.println("not leap");

        }
        sc.close();
    }
}