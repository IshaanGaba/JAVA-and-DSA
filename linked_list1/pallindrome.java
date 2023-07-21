package linked_list1;
/*
 * 1 find middle
 * 2 reverse the right half
 * 3 check if same
 */
public class pallindrome {
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
    // ---------------------pallindrome--------------------------------
    public Node middle(Node head) {
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean ispal() {
        if(head==null || head.next==null){
            return true;
        }
        Node rhead=middle(head);
        Node lhead=head;
        //reverse right
        Node curr=middle(head);
        Node prev=null;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        rhead=prev;

        //ispal
        while(rhead!=null){//lhead not needed
            if(rhead.data!=lhead.data){
                return false;
            }
            rhead=rhead.next;
            lhead=lhead.next;
        }
        return true;
    }
    public static void main(String[] args) {
        pallindrome ll=new pallindrome();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        // ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
        System.out.println(ll.ispal());
        
    }
}
