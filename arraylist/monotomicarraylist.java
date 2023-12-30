package arraylist;

import java.util.ArrayList;

public class monotomicarraylist {
    public static boolean mono(ArrayList<Integer> l) {
        int flagi=0;//or true
        int flagd=0;// or true
        for (int i = 0; i < l.size()-1; i++) {
            if(l.get(i)<l.get(i+1)){
                flagi++;//flagd=false;
            }else if(l.get(i)>l.get(i+1)){
                flagd++;//flagi=false;
            }
        }
        //return flagi|| flagd;
        if(flagi>0 && flagd>0){
            return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(6);
        System.out.println(mono(list));
    }
}
