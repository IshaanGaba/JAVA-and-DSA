package Graphs5;
// --------------O(1)
public class union_find {
    static int v=7;
    static int par[]=new int[v];
    static int rank[]=new int[v];
    public static void init() {
        for(int i=0;i<v;i++){
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
        if(rank[A]!=rank[B]){
            if(rank[A]>rank[B]){
                par[B]=A;
                rank[A]++;
            }
            else{
                par[A]=B;
                rank[B]++;
            }
        }
        else{
            par[B]=A;
            rank[A]++;
        }
    }
    public static void main(String[] args) {
        init();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        union(1, 5);
        System.out.println(find(4));
    }
}
