package Binary_tree3;


public class min_distance {
    public static class Node{//O(n)
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node lca(Node root,int n1,int n2) {
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node left=lca(root.left, n1, n2);
        Node right=lca(root.right, n1, n2);
        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }
        return root;
    }
    public static int min_d(Node root,int n) {
        if(root==null){
            return -1;

        }
        if(root.data==n){
            return 0;
        }
        int left=min_d(root.left, n);
        int right=min_d(root.right, n);
        if(left==-1 && right==-1){
            return -1;
        }
        else if(left==-1){
            return right+1;
        }
        else{
            return left+1;
        }
    }
    public static int min(Node root,int n1,int n2) {
        Node lca=lca(root, n1, n2);
        int d1=min_d(lca, n1);
        int d2=min_d(lca,n2);
        return d1+d2;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(min(root, 4, 6));
    }
}
