package Graphs2;

import java.util.*;
//O(V+E)
public class modified_dfs{
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

        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 1));
        
        graph[1].add(new edge(1, 2));
        
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 4));
        
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4 , 5));
    }
    public static void dfs(ArrayList<edge>[] graph) {
        boolean vis[]=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                dfsUtil(graph,vis,i);
            }
        }
    }
    public static void dfsUtil(ArrayList<edge>[] graph,boolean vis[],int i){
        System.out.println(i+" ");
        vis[i]=true;
        for (int j = 0; j < graph[i].size(); j++) {
            edge e=graph[i].get(j);
            if(!vis[e.des]){
                dfsUtil(graph, vis, e.des);
            }
        }

    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        dfs(graph);
    }
}