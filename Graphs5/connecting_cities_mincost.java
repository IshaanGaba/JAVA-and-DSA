package Graphs5;
//if matrix is given,in edge class use des,wt only .dont use src as many edges do not exist.and if we store in graph,wt-0 will be stored and least will be 0.
//-------------O(V^2)
import java.util.PriorityQueue;

public class connecting_cities_mincost{
    static class edge implements Comparable<edge>{
        
        int des;
        int wt;
        public edge(int des,int wt){
            this.des=des;
            this.wt=wt;
        }
        @Override
        public int compareTo(edge p2){
            return this.wt-p2.wt;
        }
    }

    public static int mincost(int cities[][]) {
        int v=cities.length;
        int min=0;
        PriorityQueue<edge> pq=new PriorityQueue<>();
        pq.add(new edge(0, 0));
        boolean vis[]=new boolean[v];
        while(!pq.isEmpty()){
            edge curr=pq.remove();
            if(!vis[curr.des]){
                vis[curr.des]=true;
                min+=curr.wt;
                for (int i = 0; i < cities[curr.des].length; i++) {
                    if(cities[curr.des][i]!=0){//edge does not exist
                        pq.add(new edge(i,cities[curr.des][i]));
                    }
                }
            } 
        } 
        return min;
    }
    public static void main(String[] args) {
        int cities[][]={{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,0}};
        System.out.println(mincost(cities));

    }
}