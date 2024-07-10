package Binary_tree_assignment;
// A binary tree is uni-valued if every node in the tree has the same value.

// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
public class univalued {
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
    public static boolean check(Node root,int val) {
        if(root== null){
            return true;
        }
        if(root.data!=val){
            return false;
        }
        return check(root.left, val) && check(root.right, val);
    }
    public static boolean isUnivalued(Node root) {
        if(root==null){
            return true;
        }
        return check(root,root.data);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(1);
        root.right=new Node(1);
        root.left.left=new Node(1);
        root.right.right=new Node(5);
        System.out.println(isUnivalued(root));
    }
}
