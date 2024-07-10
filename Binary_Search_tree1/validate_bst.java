package Binary_Search_tree1;

public class validate_bst {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }//OR
    public static boolean validate(Node root,int min,int max) {
        if(root==null){
            return true;
        }
        if(root.data>=max || root.data<=min){
            return false;
        }
        return validate(root.left,min,root.data) && validate(root.right,root.data,max);
    }//OR
    public static boolean isvalid(Node root,Node min,Node max) {
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && max.data<=root.data){
            return false;
        }
        return isvalid(root.left, min, root) && isvalid(root.right, root, max);

    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(7);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
        System.out.println(isvalid(root, null, null));
    }
}
