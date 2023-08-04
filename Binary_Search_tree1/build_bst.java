package Binary_Search_tree1;

public class build_bst {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }   
    public static Node insert(Node root,int n) {
        if(root==null){
            root=new Node(n);
            return root;
        }
        if(root.data>n){
            root.left=insert(root.left, n);//to point root.left to the root
        }
        else{
            root.right=insert(root.right, n);
            
        }
        return root;

    } 
    public static Node root=null;
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int n[]={8,5,6,2,1,3,9,10};
        for (int i = 0; i < n.length; i++) {
            root=insert(root,n[i]);
        }
        inorder(root);
    }
}
