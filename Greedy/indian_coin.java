package Greedy;
import java.util.*;

public class indian_coin{
    public static int coin(int total) {
        Integer m[]={1,2,5,10,20,50,100,200,500,1000,2000};
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(m,Comparator.reverseOrder());//works on class
        int c=total;
        int ans=0;
        for (int i = 0; i < m.length; i++) {
            if(c>=m[i]){
                while (c>=m[i]) {//if repeative---say 400-200,200 
                    l.add(m[i]);
                    ans++;
                    c-=m[i];  
                }
            }
            
        }
        System.out.println(l);
        return ans;
    }
    public static void main(String[] args) {
        int total=290;
        System.out.println(coin(total));
    }
}