package Queue;

import java.util.*;

public class stack_usingqueue {
    //push-O(1)
    //pop-O(n)
    //peek-O(n)
    public static class stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        public boolean isempty(){
            return q1.isEmpty()&&q2.isEmpty();
        }
        public void push1(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public int pop1(){
            if(isempty()){
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public int peek1(){
            if(isempty()){
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);//stores last value
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static class stack1{
        //push-O(n)
        //pop-O(1)
        //peek-O(1)
   
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        public boolean isempty(){
            return q1.isEmpty()&&q2.isEmpty();
        }
        public void push1(int data){
            if(q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
            else{
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }
        }
        public int remove1(){
            if(isempty()){
                return -1;
            }
            if(!q1.isEmpty()){
                return q1.remove();
            }
            else{
                return q2.remove();
            }
            }
        public int peek1(){
            if(isempty()){
                return -1;
            }
            if(!q1.isEmpty()){
                return q1.peek();
            }
            else{
                return q2.peek();
            }

        }
    }
    public static void main(String[] args) {
        stack1 s=new stack1();
        s.push1(1);
        s.push1(2);
        s.push1(3);
        s.push1(4);
        while(!s.isempty()){
            System.err.println(s.peek1());
            s.remove1();
        }
    }
}
