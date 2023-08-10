package Hashing;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("india");
        set.add("china");
        set.add("india");
        set.add("indo");
        set.add("china");
        set.add("china");
        System.out.println(set);
        System.out.println(set.contains("china"));
        System.out.println(set.contains("nepal"));
        set.add("nepal");
        //iteration
        for (String string : set) {
            System.out.println(string);
        }
        System.out.println();
        //OR
        Iterator<String> i=set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
                

        System.out.println(set.remove("nepal"));
        System.out.println(set);

        System.out.println(set.size());

        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("india");
        set1.add("china");
        set1.add("india");
        set1.add("indo");
        set1.add("china");
        set1.add("china");
        System.out.println(set);

        TreeSet<String> set2=new TreeSet<>();//sorted----o(logn)
        set2.add("india");
        set2.add("china");
        set2.add("india");
        set2.add("indo");
        set2.add("china");
        set2.add("china");
        set2.add("nepal");
        System.out.println(set2);

    }
}
