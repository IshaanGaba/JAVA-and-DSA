package Binary_Search_tree1;

public class print_in_range {
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void print(Node root,int k1,int k2) {
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            print(root.left, k1, k2);
            System.out.print(root.data+" ");
            print(root.right, k1, k2);
        }
        else if(root.data<k1){
            print(root.right, k1, k2);
        }
        else{
            print(root.left, k1, k2);
        }

    }
    
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
        print(root, 3, 8);
    }


}
