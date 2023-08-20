package Graphs3;

// bfs+indeg
//O(V+E)
import java.util.*;

public class kahn_algo {
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
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 1));        
        
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        
        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));

        
    }
    public static void indegree(ArrayList<edge>[] graph,int indeg[]) {
        for (int i = 0;i<graph.length;i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e =graph[i].get(j);
                indeg[e.des]++;
            }
        }
    }
    public static void kahn(ArrayList<edge>[] graph) {
        int indeg[]=new int[graph.length];
        indegree(graph, indeg);
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < indeg.length; i++) {
            if(indeg[i]==0){
                q.add(i);
            }
        } 
        while (!q.isEmpty()) {
            int curr=q.remove();
            System.out.println(curr+" ");
            for (int j = 0; j < graph[curr].size(); j++) {
                    edge e=graph[curr].get(j);
                    indeg[e.des]--;
                    if(indeg[e.des]==0){
                        q.add(e.des);
                    }
                }
        }
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        kahn(graph);
    }
}
