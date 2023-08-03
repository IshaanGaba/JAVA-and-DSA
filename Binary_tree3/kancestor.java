package Binary_tree3;

public class kancestor {
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
    public static int ancestor(Node root,int k,int n) {
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left=ancestor(root.left, k, n);
        int right=ancestor(root.right, k, n);
        if(left==-1 && right==-1){
            return -1;
        }
        int max=Math.max(left, right);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        ancestor(root, 1, 6);
        }
}
