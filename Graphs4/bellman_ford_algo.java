package Graphs4;

import java.util.*;
//dijkstra for -ve edges-------O(V*E)
public class bellman_ford_algo {
    static class edge{
        int src;
        int des;
        int wt;
        public edge(int src,int des,int w){
            this.src=src;
            this.des=des;
            this.wt=w;
        }
    }
    public static void create(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));

        graph[1].add(new edge(1, 2, -4));

        graph[2].add(new edge(2, 3, 2));

        graph[3].add(new edge(3, 4, 4));

        graph[4].add(new edge(4, 1, -1));
    }
    public static void bellman(ArrayList<edge>[] graph,int src ) {
        int v=graph.length;
        int dis[]=new int[v];
        for (int i = 0; i < dis.length; i++) {
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < v-1; i++) {//u->v how many vertices from u=v-1
            //edges
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    edge e =graph[j].get(k);
                    if(dis[e.src]!=Integer.MAX_VALUE &&dis[e.src]+e.wt<dis[e.des]){
                        dis[e.des]=dis[e.src]+e.wt;
                    }
                }
            }
        } 
        //for detecting negative cycle if present
        // for (int j = 0; j < graph.length; j++) {
        //     for (int k = 0; k < graph[j].size(); k++) {
        //         edge e =graph[j].get(k);
        //         if(dis[e.src]!=Integer.MAX_VALUE &&dis[e.src]+e.wt<dis[e.des]){
        //             return true;//negatice cycle present
        //         }
        //     }
        // }
        for (int i = 0; i < dis.length; i++) {
            System.out.println(dis[i]);
        }
    }
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        bellman(graph, 0);
    }
}
