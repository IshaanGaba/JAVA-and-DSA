package Hashing;

import java.util.HashSet;

public class count_distinct {
    public static void main(String[] args) {
        int a[]={1,3,6,4,5,7,3,2,1,5,4};
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }
}
