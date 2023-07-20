package linked_list1;

public class intro {//obj is made
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    //add first
    public void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    //add last
    public void AddLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;    
        }
        tail.next=newNode;
        tail=newNode;
    }

    //print ll
    public void print(){
        // if(head==null){
        //     System.out.println("empty");
        // }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //size
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

    //add in the middle
    //-------------------IMPORTANT------------------------
    public void add(int index,int data){
        if(head==null){
            AddFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //remove First
    public int removeFirst(){
        if(head==null){
            System.out.println("empty");
            return -1;
        }
        Node temp=head;
        if(head.next==null){
            // System.out.println("now empty");
            head=tail=null;
            return temp.data;
        }
                head=head.next;
        return temp.data;
    }
    //remove last
    public int removeLast(){
        if(head==null){
            System.out.println("empty");
            return -1;
        }
        Node temp=head;
        if(head.next==null){
            // System.out.println("now empty");
            head=tail=null;
            return temp.data;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node temp1=tail;
        temp.next=null;
        tail=temp;
        return temp1.data;

    }
    public static void main(String[] args) {
        intro ll=new intro();
        ll.print();
        ll.add(0, 0);
        ll.print();
        System.out.println(ll.size());
        ll.AddFirst(1);
        ll.print();
        ll.AddFirst(2);
        ll.print();
        ll.AddLast(3);
        ll.print();
        ll.AddLast(4);
        ll.print();
        System.out.println(ll.size());
        ll.add(2, 5);
        ll.print();
        ll.add(ll.size(), 6);
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
