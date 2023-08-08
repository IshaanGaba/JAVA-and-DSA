package Heaps;

import java.util.ArrayList;

public class delete__heapify_heap {
    private static void heapify(int i,ArrayList<Integer> a){
        int min=i;
        int left=2*i+1;
        int right=2*i+2;
        while(left<a.size() && a.get(min)<a.get(left)){
            min=left;
        }
        while(right<a.size() && a.get(min)<a.get(right)){
            min=right;
        }
        if(min!=i){
            int t=a.get(i);
            a.set(i, a.get(min));
            a.set(min, t);
            heapify(min, a);
        }
    }
    public static int delete(ArrayList<Integer> a) {
        int data=a.get(0);
        int t=a.get(0);
        a.set(0, a.get(a.size()-1));
        a.set(a.size()-1, t);
        a.remove(a.size()-1);
        heapify(0,a);
        return data;

    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(4);
        a.add(5);
        a.add(3);
        a.add(1);
        System.out.println(a);
        delete(a);
        System.out.println(a);

    }
}
