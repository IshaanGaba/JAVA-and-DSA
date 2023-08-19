package Graphs2;

// dfs+stack--------
//O(V+E)
import java.util.*;

public class topological_sort {
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

        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));

        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        
    }
    public static void topoSort(ArrayList<edge>[] graph) {
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                topoSortUtil(graph,i,vis,s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void topoSortUtil(ArrayList<edge>[] graph,int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e=graph[curr].get(i);
            if(!vis[e.des]){
                topoSortUtil(graph, e.des, vis, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        topoSort(graph);
    }
}
