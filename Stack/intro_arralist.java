package Stack;

import java.util.*;

public class intro_arralist {
    //arraylist
    public static void push(ArrayList<Integer>a ,int data){
        a.add(data);
    }
    public static int pop(ArrayList<Integer>a){
        int top=a.get(a.size()-1);
        a.remove(a.size()-1);
        return top;
    }
    public static boolean empty(ArrayList<Integer>a){
        if(a.size()==0){
            return true;
        }
        return false;
    }
    public static int peek(ArrayList<Integer>a){
        int top=a.get(a.size()-1);
        return top;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        push(a, 0);
        push(a, 2);
        push(a, 1);
        push(a, 1);
        while(!a.isEmpty()){
            System.out.println(pop(a));
        }
        System.out.println(a);
        // remove(a);
        // System.out.println(a);
        // System.out.println(peek(a));
        // remove(a);
        // System.out.println(a);
        // System.out.println(peek(a));
        // System.out.println(empty(a));
        // remove(a);
        // System.out.println(a);
        // System.out.println(empty(a));
    }
}
