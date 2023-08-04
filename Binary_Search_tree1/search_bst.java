package Binary_Search_tree1;

public class search_bst {//O(h)---h-height of the tree
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    } 
    public static boolean search(Node root,int n) {
        if(root==null){
            return false;
        }
        if(root.data==n){
            return true;
        }
        if(root.data>n){
            return search(root.left, n);
        }
        else{
            return search(root.right, n);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
        System.out.println(search(root, 2));
    }
}
