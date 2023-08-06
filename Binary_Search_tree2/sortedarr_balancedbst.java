package Binary_Search_tree2;

public class sortedarr_balancedbst {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node createBST(int a[],int s,int e,Node root) {
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        root=new Node(a[mid]);//or Node root=----if root not taken as parameter
        
        root.left=createBST(a, s, mid-1, root.left);
        root.right=createBST(a, mid+1, e, root.right);
        return root;

    }
    public static void preorder(Node root) {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root=null;
        root=createBST(arr, 0, arr.length-1, root);
        preorder(root);
    }
}