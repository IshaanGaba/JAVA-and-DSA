package arraylist;
//find pair where sum=target and we have SORTED and ROTATED arraylist
import java.util.ArrayList;

public class pairsum2 {
    public static int pivot(ArrayList<Integer>list) {
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                return i;
            }
        }
        return -1;
    }
    public static void sum(ArrayList<Integer>list,int target) {
        int n=list.size();
        int rp=pivot(list);
        int lp=pivot(list)+1;
        
        while(lp!=rp){
        
            if(list.get(rp)+list.get(lp)==target){
                System.out.println(list.get(lp)+" "+list.get(rp));
                return;
            }
            else if(list.get(rp)+list.get(lp)>target){
                rp=(n+rp-1)%n;//taget is small so add small no.
            }
            else{
                lp=(lp+1)%n;
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        sum(list, 5);
        sum(list, 16);
    }
}
