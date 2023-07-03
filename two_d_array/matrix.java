package two_d_array;

import java.util.Scanner;

public class matrix {
    public static int srch(int m[][],int k) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(m[i][j]==k){
                    System.out.println("at "+i+","+j);
                    return 1;
                }
            }
        }
        System.out.println("not found");
        return -1;
    }
    public static void main(String[] args) {
        int m[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        srch(m, 5);
        System.out.println();
        srch(m, 10);
        sc.close();
    }
}
