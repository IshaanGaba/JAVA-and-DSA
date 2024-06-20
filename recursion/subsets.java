package recursion;

import java.util.ArrayList;

public class subsets {
    public static void subs(int n,ArrayList<Integer> subset) {
        if(n==0){
            System.out.println(subset);
            return;
        }
        subset.add(n);
        subs(n-1, subset);
        subset.remove(subset.size()-1);
        subs(n-1, subset);

    }
    public static void main(String[] args) {
        subs(3, new ArrayList<>());
    }
}
