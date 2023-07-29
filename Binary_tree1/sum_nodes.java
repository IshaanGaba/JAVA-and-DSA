package Binary_tree1;


public class sum_nodes {
    public static class Node{//o(n)
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }


    }
    public static int sum(Node root) {
        if(root ==null){
            return 0;
        }
        int lh=sum(root.left);
        int rh=sum(root.right);
        int s=lh+rh+root.data;
        return s;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.left.right.right=new Node(6);
        root.left.right.right.right=new Node(7);
        System.out.println(sum(root));
    }
}
