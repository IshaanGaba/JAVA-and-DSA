import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class endoscopy {
    static class Node{
            int x;
            int y;
            int l;
            Node next;
            public Node(int x,int y,int l){
                this.x=x;
                this.y=y;
                this.l=l;
            }
        } 
    static class Queue{
        
        public Node head;
        public Node tail;
        public void add(int x,int y,int l){
            Node newNode=new Node(x,y,l);
            if(head==null){
                head=newNode;
                tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public Node remove(){
            if(head==null)return null;
            if(head.next==null){
                Node x=head;
                head=null;
                tail=null;
                return x;
            }
            Node curr=head;
            head=head.next;
            return curr;
        }
        public boolean isEmpty(){
            return head==null && tail==null;
        }
       

    }
    public static int row;
    public static int col;
    public static boolean valid(int x,int y){
        return (x<row && y<col && x>=0 && y>=0);
    }
    public static boolean left(int x,int y,int map[][]){
        return (map[x][y]==1 || map[x][y]==3 || map[x][y]==7 || map[x][y]==6);
    }
    public static boolean right(int x,int y,int map[][]){
        return (map[x][y]==1 || map[x][y]==3 || map[x][y]==4 || map[x][y]==5);
    }
    public static boolean up(int x,int y,int map[][]){
        return (map[x][y]==1 || map[x][y]==2 || map[x][y]==7 || map[x][y]==4);
    }
    public static boolean down(int x,int y,int map[][]){
        return (map[x][y]==1 || map[x][y]==2 || map[x][y]==5 || map[x][y]==6);
    }
    public static int solve(int w,int z,int len,int map[][],int vis[][]){
        Queue q=new Queue();
        q.add(w,z,len);
        vis[w][z]=1;
        int ans=0;
        while(!q.isEmpty()){
            Node curr=q.remove();
            int x=curr.x;
            int y=curr.y;
            int l=curr.l;
            if(l==0)continue;
            ans++;
            if(valid(x,y-1) && left(x,y,map) && right(x,y-1,map) && vis[x][y-1]==0){
                q.add(x,y-1,l-1);
                vis[x][y-1]=1;
              
            }
            if(valid(x,y+1) && right(x,y,map) && left(x,y+1,map) && vis[x][y+1]==0){
                q.add(x,y+1,l-1);
                vis[x][y+1]=1;
              
            }
            if(valid(x+1,y) && down(x,y,map) && up(x+1,y,map) && vis[x+1][y]==0){
                q.add(x+1,y,l-1);
                vis[x+1][y]=1;
            
            }
            if(valid(x-1,y) && up(x,y,map) && down(x-1,y,map) && vis[x-1][y]==0){
                q.add(x-1,y,l-1);
                vis[x-1][y]=1;
              
            }
        }
        return ans;
        
    }
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
            row=sc.nextInt();
            col=sc.nextInt();
            int x=sc.nextInt(),y=sc.nextInt(),l=sc.nextInt();
            int map[][]=new int[row][col];
            int vis[][]=new int[row][col];
            for(int q=0;q<row;q++){
                for(int w=0;w<col;w++){
                    map[q][w]=sc.nextInt();
                }
            }
            if(map[x][y]>0){
                System.out.println(solve(x,y,l,map,vis));
            }else{
                System.out.println(0);
            }
        }

    }
}

