import java.util.*;
public class assVARIABLESQ1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        // avg of 3nos.
        /*
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float avg=(a+b+c)/3f;
        System.out.println("avg is "+avg);*/
        
        // area of square
        /*
        int s=sc.nextInt();
        int area=s*s;
        System.out.println(area);*/
        
        //cost
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float cost=0.18f*(a+b+c)+a+b+c;
        System.out.println(cost);

        int $=24;
        System.out.println("sign is "+$);

        // No, the statement will not give any error.NamesofvariablesarecalledidentifiersinJava.Identifierrulesays,identifierscanstartwithany alphabet or underscore (“_”) or dollar (“$”).According to the rule the given variable name is a valid identifier.
        
        sc.close();
     }
}
