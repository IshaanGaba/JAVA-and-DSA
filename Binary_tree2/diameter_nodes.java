package Binary_tree2;

public class diameter_nodes {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Info{
        int ht;
        int dia;
        public Info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){
      if(root ==null){
        return new Info(0, 0) ;

      } 
      Info ldia=diameter(root.left);
      Info rdia=diameter(root.right);
      int ht=Math.max(ldia.ht, rdia.ht)+1;
      int dia=Math.max(Math.max(ldia.dia, rdia.dia),ldia.ht+rdia.ht+1);
      Info self=new Info(dia, ht);
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
        System.out.println(diameter(root).dia);
    }
}
