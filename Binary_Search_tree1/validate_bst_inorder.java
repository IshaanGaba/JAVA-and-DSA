package Binary_Search_tree1;

import java.util.ArrayList;
//check is inorder sorted---??
public class validate_bst_inorder {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    } 
    public static void inorder(Node root,ArrayList<Integer> list) {
        
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
        
        
    }
    public static boolean valid(ArrayList<Integer> path) {
        for (int i = 0; i < path.size()-1; i++) {
            if(path.get(i)>path.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(7);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root, list);
        System.out.println(valid(list));
    }
}
