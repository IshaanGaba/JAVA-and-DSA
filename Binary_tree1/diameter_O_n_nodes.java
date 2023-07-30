package Binary_tree1;


public class diameter_O_n_nodes {
    public static class Node{//*****o(n)*****
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Info {
        int dia;
        int ht;
        public Info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public static Info diameter1(Node root) {
        if(root==null){
            return new Info(0, 0);
        }
        Info lInfo=diameter1(root.left);
        Info rInfo=diameter1(root.right);
        int finald=Math.max(Math.max(lInfo.dia, rInfo.dia),lInfo.ht+rInfo.ht+1);
        int finalh=Math.max(lInfo.ht,rInfo.ht)+1;
        Info self=new Info(finald,finalh); 
        return self;       
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.left.right.right=new Node(6);
        root.left.right.right.right=new Node(7);
        System.out.println(diameter1(root).dia);
    }
}
