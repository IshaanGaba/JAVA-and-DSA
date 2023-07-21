package linked_list2;

public class zigzag {
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
    public void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
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
    //------------------------------------------code-------------------------------------
    public Node middle(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    public void zig(){
        Node left=head;
        Node mid=middle();
        Node right=mid.next;
        mid.next=null;

        //reverse right
        Node curr=right;
        Node prev=null;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        right=prev;
        Node nextl,nextR;

        //zigzag
        while(left!=null && right!=null){
            nextl=left.next;
            nextR=right.next;
            left.next=right;
            right.next=nextl;
            
            left=nextl;
            right=nextR;
        }
    }
    public static void main(String[] args) {
        zigzag ll=new zigzag();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.AddFirst(6);
        
        ll.print();
        ll.zig();
        ll.print();
    }
}
