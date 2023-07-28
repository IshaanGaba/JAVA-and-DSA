package Greedy;
import java.util.*;
// -----------------------IMPORTANT----------------------------
public class chocola {
    public static int final_cost(Integer costH[],Integer costV[]) {
        int cost=0;
        Arrays.sort(costH,Collections.reverseOrder());
        Arrays.sort(costV,Collections.reverseOrder());
        int hp=1,vp=1;
        int v=0,h=0;//konsa horizontal cut and vertical cut
        while(h<costH.length && v<costV.length){
            if(costV[v]>=costH[h]){
                cost+=(costV[v]*hp);
                v++;
                vp++;
            }
            else{
                cost+=(costH[h]*vp);
                h++;
                hp++;
            }
        }
        while(h<costH.length){
            cost+=(costH[h]*vp);
            h++;
            hp++;
        }
        while(v<costV.length){
            cost+=(costV[v]*hp);
            v++;
            vp++;
        }
        return cost;
    }
    public static void main(String[] args) {
        Integer costH[]={2,1,3,1,4};
        Integer costV[]={4,1,2};
        System.out.println(final_cost(costH, costV));

    }
}
