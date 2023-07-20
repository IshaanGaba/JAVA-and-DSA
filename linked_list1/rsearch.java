package linked_list1;

public class rsearch {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //---------------------IMPORTANT---------------------------
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index=helper(head.next, key);
        if(index==-1){
            return -1;
        }
        return index+1;
        //the one who found returned 0 then return + 1 for the below ones 
    }
    public int searchr(int t){
        return helper(head,t);

    }
    public static void main(String[] args) {
        rsearch ll=new rsearch();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.AddFirst(6);
        ll.print();
        System.out.println(ll.searchr(3));
        System.out.println(ll.searchr(40));
    }
}
