package Binary_tree3;

import java.util.LinkedList;
import java.util.Queue;

public class klevel {
    public static class Node{//O(n)
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void level(Node root,int lvl,int k) {//recursive
        if(root==null){
            return;
        }
        if(lvl==k){
            System.out.print(root.data+" ");
            return;
        }
        level(root.left, lvl+1, k);
        level(root.right, lvl+1, k);
        
    }
    //iterative ---level order
    public static void level1(Node root,int k,int n) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
    
        while (!q.isEmpty()) {
            Node cur=q.remove();
            if(cur==null){
                n++;
                // System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(n==k){
                    
                    System.out.print(cur.data+" ");
                    
                }

                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        level1(root,3,1);
        level(root, 1, 2);
    }
}
