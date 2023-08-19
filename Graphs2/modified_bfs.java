package Graphs2;
import java.util.*;
public class modified_bfs{//O(V+E)
    static class edge{
        int src;
        int des;
        public edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static void create(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        
        graph[1].add(new edge(1, 2));
        
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 4));
        
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4 , 5));
    }
    public static void bfs(ArrayList<edge>[] graph) {
        boolean vis[]=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                bfsUtil(graph,i,vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<edge>[] graph,int c,boolean vis[]) {
        Queue<Integer> q=new LinkedList<>();
        q.add(c);
        while(!q.isEmpty()){
            int curr=q.remove();
            vis[curr]=true;
            System.out.println(curr+" ");
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e=graph[curr].get(i);
                if(!vis[e.des]){
                    bfsUtil(graph, e.des, vis);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        bfs(graph);
    }
}