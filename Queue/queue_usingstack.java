package Queue;

import java.util.*;
public class queue_usingstack {
    //push-O(n)
    //pop-O(1)
    //peek-O(1)
    // public static class que {
    //     static Stack<Integer>s1=new Stack<>();
    //     static Stack<Integer>s2=new Stack<>();
    //     public boolean isempty(){
    //         return s1.isEmpty();
    //     }
    //     public void add(int data){
    //         if(s1.isEmpty()){
    //             s1.push(data);
    //             return;
    //         }
    //         while(!s1.isEmpty()){
    //             s2.push(s1.pop());
    //         }
    //         s1.push(data);
    //         while(!s2.isEmpty()){
    //             s1.push(s2.pop());
    //         }
    //     }
    //     public int remove(){
    //        if(s1.isEmpty()){
    //             return -1;
    //         } 
    //         return s1.pop();
    //     }
    //     public int peek(){
    //        if(s1.isEmpty()){
    //             return -1;
    //         } 
    //         return s1.peek();
    //     }
    // }
    public static class que1 {
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();
        public boolean isempty(){
            return s1.isEmpty() && s2.isEmpty();
        }
        public void add(int data){
            if(!s1.isEmpty()){
                s1.push(data);
            }
            else{
                s2.push(data);
            }
        }
        public int remove(){
           if(isempty()){
            return -1;
           }
           int front=-1;
           if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                front=s1.pop();
                if(s1.isEmpty()){
                    break;
                }
                s2.push(front);
            }
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
           }
           else{
        
            while(!s2.isEmpty()){
                front=s2.pop();
                if(s2.isEmpty()){
                    break;
                }
                s1.push(front);
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
           }
           return front;
        }
        
        public int peek(){
           if(isempty()){
            return -1;
           }
           int front=-1;
           if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                front=s1.pop();
                
                s2.push(front);
            }

           }
           else{
        
            while(!s2.isEmpty()){
                front=s2.pop();
                
                s1.push(front);
            }
            
           }
           return front;
        }
        

    }

    public static void main(String[] args) {
        que1 q=new que1();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isempty()){
            System.out.println(q.remove());
            // q.remove();
        }
    }
}
