package arraylist;

import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(31);
        list.add(2);
        System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
