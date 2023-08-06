package Binary_Search_tree2;

import java.util.ArrayList;

public class merge_bsts {
    public static class Node{//O(n)
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void inorder(Node root,ArrayList<Integer> path) {
        if(root==null){
            return;
        }
        inorder(root.left, path);
        path.add(root.data);
        inorder(root.right, path);
    }
    public static ArrayList<Integer> combine(ArrayList<Integer> path1,ArrayList<Integer> path2) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<path1.size() && j<path2.size()){
            if(path1.get(i)>=path2.get(j)){
                ans.add(path2.get(j));
                j++;
            }
            else{
                ans.add(path1.get(i));
                i++;
            }
        }
        while(i<path1.size()){
            ans.add(path1.get(i));
            i++;
        }
        while(j<path2.size()){
            ans.add(path2.get(j));
            j++;
        }
        return ans;
    }
    public static Node create(Node root,ArrayList<Integer> ans,int s,int e) {
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        root=new Node(ans.get(mid));
        root.left=create(root.left, ans, s, mid-1);
        root.right=create(root.right, ans, mid+1, e);
        return root;

    }
    public static Node merge(Node root1,Node root2) {
        ArrayList<Integer> path1=new ArrayList<>();
        ArrayList<Integer> path2=new ArrayList<>();
        inorder(root1, path1);
        inorder(root2, path2);
        
        ArrayList<Integer> ans=combine(path1, path2);
        Node root=null;
        root=create(root, ans, 0, ans.size()-1);
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
        Node root1=new Node(8);
        root1.left=new Node(5);
        root1.right=new Node(10);
        
        Node root2=new Node(6);
        root2.left=new Node(3);
        root2.right=new Node(9);
        
        Node root=merge(root1, root2);
        preorder(root);
        
    }
}
