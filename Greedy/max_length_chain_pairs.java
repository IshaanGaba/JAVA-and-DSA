package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class max_length_chain_pairs {
    public static int chain(int a[][]) {
        //sorting
        Arrays.sort(a,Comparator.comparingDouble(o->o[1]));
        int c=1;
        int last=a[0][1];
        for(int i=1;i<a.length;i++){
            if(a[i][0]>last){
                c++;
                last=a[i][1];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int a[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(chain(a));
    }
}
