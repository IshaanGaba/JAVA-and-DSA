package Queue;
//only even length allowed

import java.util.*;

public class interleave_2halves {
    public static void interleave(Queue<Integer>q1) {//when queue is given 
        Queue<Integer> q2=new LinkedList<>();
        int size=q1.size();
        for(int i=0;i<size/2;i++){//q1.size()/2 ----not allowed in for loop as size becomes variable bec of q1.remove() and we need to store it before
            q2.add(q1.remove());
        }
        
        while(!q2.isEmpty()){
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
        
    }
    public static void interleave(int a[]) {//using array as input and 2 queues
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=0;i<(int)a.length/2;i++){
            q1.add(a[i]);
        }
        for(int i=(int)a.length/2;i<a.length;i++){
            q2.add(a[i]);
        }
        while(!q1.isEmpty()){
            System.out.print(q1.remove()+" "+q2.remove()+" ");
        }
        
    }
    public static void main(String[] args) {
        // int a[]={1,2,3,4,5,6};//only even length allowed
        Queue<Integer> q1=new LinkedList<>();
        for(int i=1;i<11;i++){
            q1.add(i);
        }
        interleave(q1);
        // interleave(a);
        while(!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }
    }
}
