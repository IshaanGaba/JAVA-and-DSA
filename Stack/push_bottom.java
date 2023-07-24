package Stack;

import java.util.Stack;

public class push_bottom {//O(n)
    public static void pushb(Stack<Integer>s,int data) {
        //base
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushb(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        pushb(s, 4);
        System.out.println(s);

    }
}
