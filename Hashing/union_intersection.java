package Hashing;

import java.util.HashSet;

public class union_intersection {
    public static void main(String[] args) {
        int s1[]={3,6,9,8,5,2,1,9};
        int s2[]={8,4,7,3,6,9,4,6,8};
        //union
        HashSet<Integer> s=new HashSet<>();
        for (Integer integer : s1) {
            s.add(integer);
        }
        for (Integer integer : s2) {
            s.add(integer);
        }
        System.out.println(s);
        System.out.println(s.size());
        s.clear();
        //intersection
        for (int i = 0; i < s1.length; i++) {
            s.add(s1[i]);
        }
        int c=0;
        for (int i = 0; i < s2.length; i++) {
            if(s.contains(s2[i])){
                c++;
                System.out.println(s2[i]);
                s.remove(s2[i]);//important step ---need to remove
            }
        }
        System.out.println();
        System.out.println(c);
    }
}
