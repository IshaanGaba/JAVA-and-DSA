package Stack;

import java.util.Stack;

public class reverse_string {//O(n)
    public static String reverse(String str) {
        Stack<Character> s=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        while(!s.isEmpty()){
            char c=s.pop();
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="ishaan";
        System.out.println(reverse(s));


    }
}
