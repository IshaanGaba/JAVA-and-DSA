package Graphs1;
//modified bfs -------------------->Graphs2
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//O(V+E)
public class bfs_traversal {
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
        
        graph[2].add(new edge(2, 4, 1));
        graph[2].add(new edge(2, 0, 1));
        
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 5, 1));
        
        graph[4].add(new edge(4, 5, 1));
        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
    }
    public static void bfs(ArrayList<edge>[] graph,boolean vis[]) {
        Queue<Integer> q=new LinkedList<>();
        
        q.add(0);
        vis[0]=true;
        while (!q.isEmpty()) {
            int curr=q.remove();
            System.out.println(curr+" ");
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e=graph[curr].get(i);
                if(!vis[e.des]){
                    q.add(e.des);
                    vis[e.des]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        bfs(graph, new boolean[graph.length]);
    }
}
