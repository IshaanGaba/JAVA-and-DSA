package Graphs2;
//O(V+E)
import java.util.*;
//use bfs---graph coloring --2 colors only
public class bipartite {
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
    public static boolean isBipartite(ArrayList<edge>[] graph) {
        int color[]=new int[graph.length];//2colors--- 0 and 1
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < color.length; i++) {
            color[i]=-1;
        }
        for (int i = 0; i < graph.length; i++) {
            if(color[i]==-1){
                q.add(i);
                color[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        edge e=graph[curr].get(j);
                        if(color[e.des]==-1){
                            int nextcolor=color[curr]==0 ? 1:0;
                            color[e.des]=nextcolor;
                            q.add(e.des);
                        }
                        else if(color[e.des]==color[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        System.out.println(isBipartite(graph));
    }
}
