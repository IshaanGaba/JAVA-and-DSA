package Stack;
import java.util.Stack;

public class reverse_stack {
    public static void pushBottom(Stack<Integer> s,int d) {
        if(s.isEmpty()){
            s.push(d);
            return;
        }
        int t=s.pop();
        pushBottom(s, d);
        s.push(t);
    }
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        // s.push(top);--->give in same order
        //use push_bottom
        pushBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
}
