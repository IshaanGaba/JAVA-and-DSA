package arraylist;

import java.util.ArrayList;

public class swap {
    public static void exchange(ArrayList<Integer> list,int i,int j) {
        int t=list.get(i);
        list.set(i, list.get(j));
        list.set(j, t);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(31);
        list.add(2);
        System.out.println(list);
        exchange(list, 0, 3);
        System.out.println(list);
    }
}
