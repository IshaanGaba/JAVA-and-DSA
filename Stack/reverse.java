package Stack;
import java.util.Stack;
public class reverse {
    public static void reverses(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverses(s);
        System.out.println(top);
        s.push(top);
        //push at bottom
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>(); 
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        reverses(s);
        System.out.println(s);
        System.out.println();
    }
}
