package Binary_tree3;

public class transform_sum {
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
    public static int sum(Node root) {
        if(root==null){
            return 0;
        }
        int data=root.data;
        int left=sum(root.left);
        int right=sum(root.right);
        int leftc=root.left==null?0:root.left.data;
        int rightc=root.right==null?0:root.right.data;
        root.data=left+right+leftc+rightc;
        return data;
    }
    public static void preorder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // preorder(root);
        sum(root);
        preorder(root);
    }
}
