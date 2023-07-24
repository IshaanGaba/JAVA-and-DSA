package Stack;

import java.util.Stack;

public class validparentheses {
    public static boolean valid(String str) {
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' ||ch=='{'){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){//kuch nikalne ke liye nhi bacha h
                    return false;
                }
                if((ch==')'&&s.peek()=='(') || 
                (ch=='}'&&s.peek()=='{') ||
                (ch==']'&&s.peek()=='[') ){
                    s.pop();
                }
                else{
                return false;
            }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="{{{}}}(";
        System.out.println(valid(str));
    }
}
