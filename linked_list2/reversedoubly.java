package linked_list2;

public class reversedoubly {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node curr=head;
        Node Prev=null;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=Prev;
            curr.prev=Next;

            Prev=curr;
            curr=Next;
        }
        head=Prev;
    }
    public static void main(String[] args) {
        reversedoubly ll=new reversedoubly();
        
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
