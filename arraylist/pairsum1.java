package arraylist;

import java.util.ArrayList;
//find pair where sum=target and we have SORTED arraylist
public class pairsum1 {
    public static void sum(ArrayList<Integer> list,int target) {//n
        //2 pointer approach---SORTED
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp) {//(lp<rp)
            if(list.get(rp)+list.get(lp)==target){
                System.out.println(list.get(lp)+" "+list.get(rp));
                return;
            }
            else if(list.get(rp)+list.get(lp)>target){
                rp--;//taget is small so add small no.
            }
            else{
                lp++;
            }
        }
    }
    public static void sum1(ArrayList<Integer> list,int target) {//n^2
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if((list.get(i)+list.get(j))==target){
                    System.out.println(list.get(i)+" "+list.get(j));
                    return;//only first
                }   
                            
            }
           
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        sum1(list, 5);
        sum(list, 5);
    }
}
