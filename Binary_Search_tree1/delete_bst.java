package Binary_Search_tree1;

public class delete_bst {

    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static int find_inorder_successor(Node root) {
        
        while (root.left!=null) {
            root=root.left;
        }
        return root.data;
    } 
    public static Node delete(Node root,int n) {
        if(root==null){
            return null;
        }
        if(root.data>n){
            root.left=delete(root.left, n) ;
        }
        else if(root.data<n){
            root.right=delete(root.right, n);
        }
        else{
            //no child
            if(root.left==null && root.right==null){
                return null;
            }
            //1 child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null) {
                return root.left;
            }
            //2 child--------------------IMPORTANT-------------------------
            int successor=find_inorder_successor(root.right);
            root.data=successor;
            root.right=delete(root.right, successor);
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.right=new Node(11);
        inorder(root);
        System.out.println();
        delete(root, 8);
        inorder(root);
    }
}
