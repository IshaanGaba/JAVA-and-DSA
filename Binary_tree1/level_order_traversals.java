package Binary_tree1;

//---------------------------BFS like approach-------------------------------
import java.util.LinkedList;
import java.util.Queue;

public class level_order_traversals {
    public static class Node{//o(n)
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
        public Node build(int n[]){
            index++;
            if(n[index]==-1){
                return null;
            }
            Node newNode=new Node(n[index]);
            newNode.left=build(n);
            newNode.right=build(n);
            return newNode;

        }
    }
    public static void levelorder(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node newNode=q.remove();
            if(newNode==null){
                System.out.println();//new line
            
                if(q.isEmpty()){
                    break;
                }
                else{
                   q.add(null); //add null at last of the queue
                }
            }
            else{
                System.out.print(newNode.data+" ");
                if(newNode.left!=null){
                    q.add(newNode.left);
                }
                if(newNode.right!=null){
                    q.add(newNode.right);
                }

            }
        }
    }
    public static void main(String[] args) {
        int n[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinTree t=new BinTree();
        Node root=t.build(n);
        levelorder(root);
    }
}
