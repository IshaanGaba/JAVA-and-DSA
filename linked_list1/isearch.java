package linked_list1;

public class isearch {
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
    //--------------------search-----------------------
    public int search(int target){
        if(head==null){
            return -1;
        }
        int i=1;
        Node temp=head;
        while (temp!=null) {
            if(temp.data==target){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        isearch ll=new isearch();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.AddFirst(6);
        ll.print();
        System.out.println(ll.search(40));
    }
}
