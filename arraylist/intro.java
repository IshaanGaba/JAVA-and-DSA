package arraylist;
// add
// remove
// contains
// set
// get
import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(31);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(2));
        list.get(3);
        
        list.remove(3);
        System.out.println(list);
        
        list.add(2, 43);
        
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(5));

        list.set(3,6);//update
        System.out.println(list);
        System.out.println(list.size());

    }
}
