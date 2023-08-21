package Graphs4;

import java.util.*;

public class bellman_ford_algo {
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

        // graph[0].add(new edge(0, 1));
        
        // graph[1].add(new edge(1, 0));
        // graph[1].add(new edge(1 , 2));
    }
    
    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        
    }
}
