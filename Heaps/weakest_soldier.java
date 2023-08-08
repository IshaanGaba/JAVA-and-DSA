package Heaps;

import java.util.PriorityQueue;

public class weakest_soldier {
    public static class soldier implements Comparable<soldier>{
        int idx;
        int count;//count soldier
        public soldier(int idx,int count){
            this.idx=idx;
            this.count=count;
        }

        @Override
        public int compareTo(soldier s1){
            if(this.count-s1.count==0){
                //same soldier
                return this.idx-s1.idx;
            }
        return this.count-s1.count;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<soldier> pq=new PriorityQueue<>();
        int k=2;//how many to print
        int a[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        for (int i = 0; i < a.length; i++) {
            int c=0;
            for (int j = 0; j < a[0].length; j++) {
                c+=a[i][j]==1?1:0;
                
            }
            pq.add(new soldier(i, c));
        }
        for (int i = 0; i < k; i++) {
            System.out.println(pq.remove().idx);
        }
    }
}
