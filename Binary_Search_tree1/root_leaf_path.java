package Binary_Search_tree1;

import java.util.ArrayList;

public class root_leaf_path {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    } 
    public static void print(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    //correct code is this(done)
    public static void path(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer>a){
        if(root==null){
            return;
        }
        a.add(root.data);
        if(root.left==null && root.right==null){
            ans.add(new ArrayList<>(a));
            
        }else{
        path(root.left,ans,a);
        path(root.right,ans,a);
            
        }
        a.remove(a.size()-1);
    }
    public static void path1(Node root,ArrayList<Integer> path) {
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){ //reached leaf
            print(path);   
        }
        path1(root.left,path);
        path1(root.right,path);
        path.remove(path.size()-1);
    }
    
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
        path1(root,new ArrayList<>());
    }
}
