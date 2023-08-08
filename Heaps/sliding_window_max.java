package Heaps;

import java.util.PriorityQueue;

public class sliding_window_max {//O(nlog k)
    public static class pair implements Comparable<pair>{
        int indx;
        int value;
        public pair(int indx,int value){
            this.indx=indx;
            this.value=value;

        }
        @Override
        public int compareTo(pair p1){
            return p1.value-this.value;//descending
        }
    }
    public static void main(String[] args) {
        PriorityQueue<pair> pq=new PriorityQueue<>();
        int a[]={1,3,-1,-3,5,3,6,7};
        int k=3;//window size;
        int n=a.length;
        int ans[]=new int[n-k+1];
        //add k elemnts in queue
        for (int i = 0; i < k; i++) {
            pq.add(new pair(i, a[i]));
        }
        //adding 1st elemnt in ans
        ans[0]=pq.peek().value;
        //for next k window
        for (int i = k; i < a.length; i++) {
            while(pq.size()>0 && pq.peek().indx<=(i-k)){
                pq.remove();
            }
            pq.add(new pair(i, a[i]));
            ans[i-k+1]=pq.peek().value;
        }

        for (int j = 0; j < ans.length; j++) {
            System.out.print(ans[j]+" ");
        }
    }
}
