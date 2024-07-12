package Binary_Search_tree2;

import java.util.ArrayList;

public class bst_to_balancedbst {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void inorder(Node root,ArrayList<Integer> list) {
        if(root  == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);

    }
    public static Node createBST(int s,int e,ArrayList<Integer>list) {
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        Node root=new Node(list.get(mid));
        root.left=createBST(s, mid-1, list);
        root.right=createBST(mid+1, e, list);
        return root;
    }
    public static void preorder(Node root) {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node balance(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root, list);
        root=createBST(0, list.size()-1, list);
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        preorder(root);
        System.out.println();
        // ArrayList<Integer> list=new ArrayList<>();
        // inorder(root, list);
        // root=createBST(root, 0, list.size()-1, list);
        root=balance(root);
        preorder(root);
        
    }
}
