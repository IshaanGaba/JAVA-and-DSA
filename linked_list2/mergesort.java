package linked_list2;
/*--------------nlogn-----------------
    1-middle-1st half ka last
    2-lefthalf righthalf
    3-merge
 */
public class mergesort {
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
    //---------------------------------code------------------------------------
    private  static Node merge(Node lhead,Node rhead){
        Node merged=new Node(-1);
        Node temp=merged;

        while(lhead!=null && rhead!=null){
            if(lhead.data<=rhead.data){
                temp.next=lhead;
                lhead=lhead.next;
            }
            else{
                temp.next=rhead;
                rhead=rhead.next;
            }
            temp=temp.next;
        }
        while(lhead!=null){
            temp.next=lhead;
            lhead=lhead.next;
            temp=temp.next;
        }
        while(rhead!=null){
            temp.next=rhead;
            rhead=rhead.next;
            temp=temp.next;
        }
        return merged.next;
    }
    public static Node merge_sort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node rhead=slow.next;
        slow.next=null;
        Node left=merge_sort(head);
        Node right=merge_sort(rhead);
        return merge(left,right);

    }
    public static void main(String[] args) {
        mergesort ll=new mergesort();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        
        ll.print();
        head=merge_sort(head);
        ll.print();

    }
    

}
