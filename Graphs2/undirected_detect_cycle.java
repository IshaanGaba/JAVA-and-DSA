package Graphs2;

import java.util.*;
//use dfs
/*
    standing curr node
    vis[neigh]---false--visit
    vis[neigh]----not through parent ---true
    vis[neigh]----through parent ---continue--check others
 */
public class undirected_detect_cycle {
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
        // graph[0].add(new edge(0, 2));
        
        graph[1].add(new edge(1, 2));
        
        // graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 4));
        
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4 , 5));
    }
    public static boolean detect_cycle(ArrayList<edge>[] graph) {
        boolean vis[]=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                if(detect_cycleUtil(graph,vis,i,-1)){// intially parent=-1
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detect_cycleUtil(ArrayList<edge>[] graph,boolean vis[],int curr,int parent) {
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e=graph[curr].get(i);
            if(!vis[e.des]){
                if(detect_cycleUtil(graph, vis, e.des,curr)){
                    return true;
                }
            
            }
            else if(vis[e.des]==true && e.des!=parent){//important
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        System.out.println(detect_cycle(graph));
    }
}
