package Binary_tree2;

import java.util.*;
public class top_view {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Info{
        Node node;
        int hd;//horizontal distance
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void top(Node root) {
        if(root==null){
            return;
        }
        int min=0,max=0;//to access the hashmap
        Queue<Info> q=new LinkedList<>();
        q.add(new Info(root,0));
        q.add(null);
        HashMap<Integer,Node> h=new HashMap<>();
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                // System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!h.containsKey(curr.hd)){
                    h.put(curr.hd, curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
                
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(h.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        // root.right=new Node(3);
        root.left.right.right=new Node(6);
        root.left.right.right.right=new Node(7);
        top(root);
    }
}
