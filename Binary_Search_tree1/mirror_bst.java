package Binary_Search_tree1;

public class mirror_bst {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node mirror(Node root) {
        if(root==null){
            return null;
        }
        Node left=mirror(root.left);
        Node right=mirror(root.right);
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
        root.left.right=new Node(7);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
        root= mirror(root);
        preorder(root);
    }
}
