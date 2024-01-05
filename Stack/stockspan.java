package Stack;

import java.util.Stack;

public class stockspan {
    public static void spans(int p[], int span[]) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;
        for (int i = 1; i < span.length; i++) {
            while (!s.isEmpty() && p[i] >= p[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int p[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[p.length];
        spans(p, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}
