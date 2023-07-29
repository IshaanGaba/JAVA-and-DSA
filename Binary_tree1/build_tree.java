package Binary_tree1;

public class build_tree {
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
    public static void main(String[] args) {
        int n[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinTree t=new BinTree();
        Node root=t.build(n);
        System.out.println(root.data);
    }
}
