package Graphs5;

import java.util.*;

public class kruskal_algo {
    static int v=4;
    static int par[]=new int[v];
    static int rank[]=new int[v];
    public static void init() {
        for (int i = 0; i < par.length; i++) {
            par[i]=i;
        }
    }
    public static int find(int x) {
        if(x==par[x]){
            return x;
        }
        return par[x]=find(par[x]);
    }
    public static void union(int a,int b) {
        int A=find(a);
        int B=find(b);
        if(rank[A]==rank[B]){
            par[B]=A;
            rank[A]++;
        }
        else{
            if(rank[A]>rank[B]){
                par[B]=A;
            }
            else{
                par[A]=B;
            }
        }
    }
    static class edge implements Comparable<edge>{
        int src;
        int des;
        int wt;

        public edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
        @Override
        public int compareTo(edge e1){
            return this.wt-e1.wt;
        }
    }
    public static void create(ArrayList<edge> edges) {
        //edges
        edges.add(new edge(0, 2, 15));
        edges.add(new edge(2, 3, 50));
        edges.add(new edge(1, 3, 40));
        edges.add(new edge(0, 3, 30));
        edges.add(new edge(0, 1, 10));
    }
    public static void kruskal(ArrayList<edge> edges,int v) {
        init();
        Collections.sort(edges);
        int min=0;
        int count=0;//to count how many edges are included in mst 
        for (int i = 0; count<v-1; i++) {
            edge e=edges.get(i);
            int A=find(e.src);
            int B=find(e.des);
            if(A!=B){//cycle detection
                union(A, B);
                min+=e.wt;
                count++;
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        ArrayList<edge> edges=new ArrayList<>();
        create(edges);
        kruskal(edges,v);
    }
}
