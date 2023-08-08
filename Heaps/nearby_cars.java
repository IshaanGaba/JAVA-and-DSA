package Heaps;

import java.util.PriorityQueue;

public class nearby_cars {
    public static class car implements Comparable<car>{
        int idx;
        int x;
        int y;
        int dsq;//distance square
        public car(int idx,int x,int y,int dsq){
            this.idx=idx;
            this.x=x;
            this.y=y;
            this.dsq=dsq;
        }

        @Override
        public int compareTo(car c1){
            return this.dsq-c1.dsq;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<car> pq=new PriorityQueue<>();
        int a[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        for (int i = 0; i < a.length; i++) {
            int dsq=a[i][0]*a[i][0]+a[i][1]*a[i][1];
            pq.add(new car(i, a[i][0], a[i][1], dsq));

        }
        for (int i = 0; i < k; i++) {
           System.out.println(pq.remove().idx);        
        }
    }
}
