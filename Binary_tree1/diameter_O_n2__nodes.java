package Binary_tree1;


public class diameter_O_n2__nodes {
    public static class Node{//*****o(n^2)*****
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }


    }
    public static int height(Node root) {
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;

    }
    public static int diameter1(Node root) {
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int ldiam=diameter1(root.left);
        int rh=height(root.right);
        int rdiam=diameter1(root.right);
        return Math.max(Math.max(ldiam, rdiam),lh+rh+1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.left.right.right=new Node(6);
        root.left.right.right.right=new Node(7);
        System.out.println(diameter1(root));
    }
}
