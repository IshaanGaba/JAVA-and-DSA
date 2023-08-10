package Hashing;

import java.util.HashMap;

public class majority_element{
    public static void main(String[] args) {
        int a[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        //(element,freq)
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
            //OR
            // if(map.containsKey(a[i])){
            //     map.put(a[i], map.get(a[i])+1);

            // }
            // else{
            //     map.put(a[i], 1);
            // }

        }
        for (Integer i : map.keySet()) {
            if(map.get(i)>(a.length/3)){
                System.out.println(i);
            }
        }
    }
}