package linked_list1;

public class remove_nth_end {
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
    public int size(){
        int s=0;
        if(head==null){
            return s;
        }
        Node temp=head;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        return s;
    }
    public void removen(int index){
        if(index==size()){//delete head
            head=head.next;
            return;
        }
        int i=(size()-index);
        
        Node prev=head;
        int j=1;
        while(j<i){
            prev=prev.next;//node to be removed ka previous
            j++;
        }
        prev.next=prev.next.next;
        
    }
    public static void main(String[] args) {
        remove_nth_end ll=new remove_nth_end();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.AddFirst(6);
        ll.print();
        ll.removen(3);
        // ll.removen(3);
        ll.print();
    }
}
