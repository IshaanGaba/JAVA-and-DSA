package Graphs1;
//O(V+E)

import java.util.*;
//modified dfs -------------------->Graphs2
public class dfs_traversal {
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
    public static  void create(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));
        
        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));
        
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));
        
        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));
        
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
    }
    public static void dfs(ArrayList<edge>[] graph,int curr,boolean vis[]) {
        System.out.println(curr+" ");
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e=graph[curr].get(i);
            if(!vis[e.des]){
                dfs(graph, e.des, vis);
            }
        }
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        dfs(graph,0, new boolean[graph.length]);
    }
}
