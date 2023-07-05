package strings;

import java.util.Scanner;

public class pallindrome {
    public static boolean ispallindrome(String s) {
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // String s=new String("noon");
        // String s="noon";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ispallindrome(s));
        sc.close();
    }
}