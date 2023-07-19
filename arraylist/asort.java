package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class asort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        // Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());//imp
        System.out.println(list);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("john");
        list1.add("singh");
        list1.add("thx");
        list1.add("hello");
        list1.add("world");
        Collections.sort(list1);
        // Collections.sort(list1,Collections.reverseOrder());//imp
        System.out.println(list1);
    }
}
