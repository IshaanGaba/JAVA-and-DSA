package Hashing;
import java.util.*;

public class Map {//map contains hashmap,linkedhashmap,treemap
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("China", 150);
        map.put("India", 100);
        map.put("Nepal", 50);
        map.put("Bhutan", 10);
        map.put("X", 40);
        System.out.println(map);
        System.out.println(map.size());
        map.remove("X");
        System.out.println(map);
        System.out.println(map.get("India"));
        map.put("India", 125);
        System.out.println(map);
        System.out.println(map.get("India"));
        System.out.println(map.containsKey("X"));
        System.out.println(map.containsKey("India"));
        for(String k:map.keySet()){//Iteration
            System.out.print(k+"-"+map.get(k));
            System.out.println();
        }
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);


        LinkedHashMap<String,Integer> map1=new LinkedHashMap<>();
        map1.put("China", 150);
        map1.put("India", 100);
        map1.put("Nepal", 50);
        map1.put("Bhutan", 10);
        map1.put("X", 40);
        System.out.println(map1);


        TreeMap<String,Integer>map2=new TreeMap<>();//sorted on the basis of keys
        map2.put("China", 150);
        map2.put("India", 100);
        map2.put("Nepal", 50);
        map2.put("Bhutan", 10);
        map2.put("X", 40);
        System.out.println(map2);
    }
}
