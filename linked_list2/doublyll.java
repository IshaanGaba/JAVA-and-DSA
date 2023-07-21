package linked_list2;

public class doublyll {
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
    public void AddLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

    }
    public void removeFirst(){
        if(head.next==null){
            System.out.println("null");
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    public void removeLast(){
        if(head.next==null){
            System.out.println("null");
            head=tail=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int size(){
        if(head==null){
            return 0;

        }
        Node temp=head;
        int s=0;
        while (temp!=null) {
            s++;
            temp=temp.next;
        }
        return s;
    }
    public static void main(String[] args) {
        doublyll ll=new doublyll();
        ll.print();
        ll.AddLast(50);
        
        ll.print();
        System.out.println(ll.size());
        ll.AddFirst(10);
        ll.print();
        System.out.println(ll.size());
        ll.AddFirst(20);
        ll.print();
        System.out.println(ll.size());
        ll.AddFirst(30);
        ll.print();
        ll.AddFirst(40);
        ll.print();
        ll.AddLast(60);
        ll.print();
        System.out.println(ll.size());
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size());
        ll.removeLast();
        ll.print();
        System.out.println(ll.size());
    }
}
