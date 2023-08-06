package Binary_Search_tree2;

public class size_largestbst {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static class Info{
        boolean isValid;
        int size;
        int min;
        int max;
        public Info(boolean isValid,int size,int min,int max){
            this.isValid=isValid;
            this.size=size;
            this.min=min;
            this.max=max;
        }

    }
    public static int large=0;
    public static Info largest(Node root) {
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info left=largest(root.left);
        Info right=largest(root.right);

        int size=left.size+right.size+1;
        int min=Math.min(Math.min(left.min, right.min),root.data);
        int max=Math.max(Math.max(left.max, right.max),root.data);

        if(root.data<=left.max || root.data>=right.min){
            return new Info(false, size, min, max);
        }
        if(left.isValid && right.isValid){
            large=Math.max(size,large);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(9);
        root.left.left=new Node(4);
        root.right=new Node(10);
        root.right.left=new Node(12);
        root.right.right=new Node(11); 
        largest(root);
        System.out.println(large);
    }
}