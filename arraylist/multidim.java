package arraylist;

import java.util.ArrayList;

public class multidim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> minlist=new ArrayList<>();
        ArrayList<Integer> minlist1=new ArrayList<>();
        minlist.add(1);
        minlist.add(2);
        minlist.add(3);
        minlist.add(4);
        minlist1.add(11);
        minlist1.add(12);
        minlist1.add(13);
        minlist1.add(14);
        list.add(minlist);
        list.add(minlist1);
        System.out.println(list);

        for (int index = 0; index < list.size(); index++) {
            ArrayList<Integer> curr=list.get(index);//list.0 is an arraylist
            for (int i = 0; i < curr.size(); i++) {
                System.out.println(curr.get(i));
            }
            System.out.println("---------");

        }

    }
}
