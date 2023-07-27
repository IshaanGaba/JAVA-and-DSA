package Queue;

import java.util.*;
public class queue_deque {
    public static class que{
        Deque<Integer> d=new LinkedList<>();
        public boolean empty(){
            return d.isEmpty();
        }
        public void add1(int data){
            d.addLast(data);
        }
        public void remove1(){
            d.removeFirst();
        }
        public int peek1(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        que q=new que();
        q.add1(1);
        q.add1(2);
        q.add1(3);
        q.add1(4);
        while (!q.empty()) {
            System.out.println(q.peek1());
            q.remove1();
        }
    }
}
