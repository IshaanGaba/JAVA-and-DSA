package Binary_tree3;

import java.util.ArrayList;

public class lowestcomm_Ancestor {
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
    public static Node  lca1(Node root,int n1,int n2) {//without extra space exxept call stack
        if(root==null ||root.data==n1 || root.data==n2){
            return root;
        }
        Node left=lca1(root.left, n1, n2);
        Node right=lca1(root.right, n1, n2);
        
        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }
        return root;
    }
    // -------------------------------------with extra space---------------
    public static boolean getdis(Node root,int n,ArrayList<Node> path) {
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean getLeft=getdis(root.left, n, path);
        boolean getRight=getdis(root.right, n, path);
        if(getLeft || getRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lca(Node root,int n1,int n2) {//with extra space
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getdis(root,n1,path1);
        getdis(root,n2,path2);
        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // System.out.println(lca(root, 4, 6).data);
        System.out.println(lca1(root, 4, 5).data);
    }
}
