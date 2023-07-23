package Stack;
import java.util.Stack;
public class reverse {
    public static void reverses(Stack<Integer> s) {
        if(!s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverses(s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>(); 
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // reverses(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
