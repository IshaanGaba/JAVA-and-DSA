package Greedy;
import java.util.Arrays;
import java.util.Comparator;

public class fractional_knapsack {
    public static int knapsack(int weight,int w[],int p[]) {
        double a[][]=new double[w.length][2];
        for(int i=0;i<w.length;i++){
            a[i][0]=i;
            a[i][1]=p[i]/(double)w[i];
        }
        Arrays.sort(a,Comparator.comparingDouble(o->o[1]));//ascending order
        int profit=0;
        int capacity=weight;
        for(int i=a.length-1;i>=0;i--){
            int idx=(int)a[i][0];
            if(capacity>=w[idx]){//include full item
                profit+=p[idx];
                capacity-=w[idx];
            }
            else{//include fractional item
                profit+=(a[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int w[]={10,20,30};
        int p[]={60,100,120};
        int weight=50;
        System.out.println(knapsack(weight, w, p));
    }
}
