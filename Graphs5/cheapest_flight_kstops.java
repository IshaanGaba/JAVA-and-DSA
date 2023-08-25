package Graphs5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
// O(V*K)  where k-stops
//no need to pq.... only q will work
public class cheapest_flight_kstops {
    static class edge{
        int src;
        int des;
        int cost;
        public edge(int src,int cost,int des){
            this.src=src;
            this.des=des;
            this.cost=cost;
        }
    }
    public static void create(ArrayList<edge> graph[],int flights[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            int src=flights[i][0];
            int des=flights[i][1];
            int cost=flights[i][2];
            graph[src].add(new edge(src, cost, des));
        }
    }
    static class info{
        int v;
        int cost;
        int stops;
        public info(int des,int cost,int stops){
            this.v=des;
            this.cost=cost;
            this.stops=stops;
        }
    }
    public static int cheapest(ArrayList<edge> graph[],int flights[][],int src,int des,int k) {
        create(graph, flights);
        int dis[]=new int[4];
        for (int i = 0; i < 4; i++) {
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        Queue<info> q=new LinkedList<>();
        q.add(new info(src, 0, 0));
        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr.stops>k){
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                edge e=graph[curr.v].get(i);
                if(curr.cost+e.cost<dis[e.des] && curr.stops<=k){
                    //dis from src-curr.cost
                    dis[e.des]=curr.cost+e.cost;
                    q.add(new info(e.des, dis[e.des], curr.stops+1));
                }
            }
        }
        if(dis[des]==Integer.MAX_VALUE){
            return -1;
        }
        return dis[des];
    }
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[]=new ArrayList[4];
        int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0;
        int des=3;
        int k=1;
        System.out.println(cheapest(graph, flights, src, des, k));
    }
}
