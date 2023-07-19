package arraylist;

import java.util.ArrayList;

public class max {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(31);
        list.add(2);
        list.add(52);
        System.out.println(list);
        int m=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            m=Math.max(m, list.get(i));
        }
        System.out.println(m);
    }
}
