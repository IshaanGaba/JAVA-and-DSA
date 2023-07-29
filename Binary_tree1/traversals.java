package Binary_tree1;

public class traversals {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static class BinTree{
        static int index=-1;
        public  Node tree(int n[]) {
            index++;
            if(n[index]==-1){
                return null;
    
            }
            Node newNode=new Node(n[index]);
            newNode.left=tree(n);;
            newNode.right=tree(n);
            return newNode;

        }
    }
    public static void preorder_trans(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder_trans(root.left);
        preorder_trans(root.right);

    }
    public static void inorder_trans(Node root) {
        if(root==null){
            return;
        }
        inorder_trans(root.left);
        System.out.print(root.data+" ");
        inorder_trans(root.right);

    }
    public static void postorder_trans(Node root) {
        if(root==null){
            return;
        }
        postorder_trans(root.left);
        postorder_trans(root.right);
        System.out.print(root.data+" ");

    }

    public static void main(String[] args) {
        // Node root=new Node(1);
        // root.left=new Node(2);
        // root.right=new Node(3);
        // root.right.right=new Node(6);
        // root.left.left=new Node(4);
        // root.left.right=new Node(5);
        int n[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinTree t=new BinTree();
        Node root=t.tree(n);
        preorder_trans(root);
        System.out.println();
        inorder_trans(root);
        System.out.println();
        postorder_trans(root);
    }
}
