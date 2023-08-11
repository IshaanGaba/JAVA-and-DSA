package Hashing;

import java.util.HashMap;

public class find_journey {
    public static String start(HashMap<String,String> map) {
        HashMap<String,String> revmap=new HashMap<>();
        for (String i : map.keySet()) {
            revmap.put(map.get(i), i);
        }
        for (String i : map.keySet()) {
            if(!revmap.containsKey(i)){
                return i;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Delhi", "Kolkata");
        map.put("Kolkata", "Chennai");

        String start=start(map);
        System.out.print(start);
        
        for (String i : map.keySet()) {
            System.out.println(i);//not required remove it
            System.out.print("->"+map.get(start));
            start=map.get(start);
        }
    }
}
