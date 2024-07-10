package Binary_tree_assignment;

import javax.swing.tree.TreeNode;

public class invert {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;

        }

    }
    public static Node invertTree(Node root) {
        if(root==null){
            return root;
        }
        Node left=invertTree(root.left);
        Node right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public static void preorder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(9);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.left=new Node(12);
        root.right.right=new Node(11);
        preorder(root);
        System.out.println();
        invertTree(root);
        preorder(root);
    }   

}
