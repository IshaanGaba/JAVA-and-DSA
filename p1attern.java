import java.util.Scanner;
/*
 line ---outer loop
 how many no. of times ---inner loop
 what to print
 */
public class p1attern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //up to down
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        //****   *** ** * 
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //1 12 123 1234
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);   
            }
            System.out.println();
        }
        System.err.println();
        
        //A BC DEJ..
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
