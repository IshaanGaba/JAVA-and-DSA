package linked_list2;
/*
 * if loop
 * slow+1
 * fast+1
 * meet at loop joining node
 * when meet prev=(fast-1)th node
 * prev.next=null;
 */
public class removeloop {
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
    public static void print(){
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
    // --------------------------code----------------------------------------
    public static Node loop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return fast;
            }
        }
        return fast;

    }

    public static void remove(){
        Node fast=loop();
        Node slow=head;
        Node prev=null;
        if(fast==null || fast.next==null){
            return;
        }
        else{
            while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next=null;

        }
    }

     //-----in one function code---------------------------
     public static void remove1(){
        Node fast=head;
        Node slow=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }  
        }
        if(cycle==false){
            return;
        }
        
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
     
    public static void main(String[] args) {
        head=new Node(0);
        head.next=new Node(10);
        head.next.next=new Node(1);
        
        head.next.next.next=new Node(115);
        head.next.next.next.next=head.next;
        remove1();
        print();

    }
}
