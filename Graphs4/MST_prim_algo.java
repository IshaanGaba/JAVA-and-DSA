package Graphs4;

//-------------O(V^2)--------------
import java.util.*;;
//for undirected weighted graph
public class MST_prim_algo {
    static class edge{
        int src;
        int des;
        int wt;
        public edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }
    public static void create(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));

        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));

        graph[2].add(new edge(2, 0, 15));
        graph[2].add(new edge(2, 3, 50));

        graph[3].add(new edge(3, 0, 30));
        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 2, 50));
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v,int cost){
            this.v=v;
            this.cost=cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void prim(ArrayList<edge>[] graph) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[graph.length];
        pq.add(new Pair(0, 0));
        int finalcost=0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalcost+=curr.cost;
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.des, e.wt));
                }
            }
        }
        System.out.println(finalcost);
    }
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        prim(graph);
    }
}
