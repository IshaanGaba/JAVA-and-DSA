package Graphs3;

import java.util.ArrayList;

//string path + arraylist of path both methods done
public class all_paths {
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
        graph[0].add(new edge(0, 3));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 1));        
        
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        
        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));        
    }
    public static void print_all(ArrayList<edge>[] graph,int src,int des,String path) {
        if(src==des){
            System.out.println(path+des);
            return;
        }  
        for (int i = 0; i < graph[src].size(); i++) {
           edge e=graph[src].get(i);
           print_all(graph, e.des, des, path+src); 
        }
    }
    public static void print_all1(ArrayList<edge>[] graph,int src,int des,ArrayList<Integer> path) {
        if(src==des){
            path.add(des);
            System.out.println(path);
            return;
        }  

        path.add(src);
        for (int i = 0; i < graph[src].size(); i++) {
           edge e=graph[src].get(i);
           print_all1(graph, e.des, des, path);
           path.remove(path.size()-1);//backtracking
        }
    }
   
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[v];
        create(graph);
        print_all(graph, 5, 1, "");
        print_all1(graph, 5, 1, new ArrayList<>());
    }
}
