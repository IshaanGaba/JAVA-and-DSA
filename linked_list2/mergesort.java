package linked_list2;
//we can use an arraylist also to store all values,sort them and then make a new ll
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
        //no need to make a new linked list connect 1st with dummy and start other connection
        while(lhead!=null && rhead!=null){
            if(lhead.data<=rhead.data){
                temp.next = lhead;  // Link temp to lhead
                temp = lhead;       // Move temp to lhead
                lhead = lhead.next; // Move lhead to the next node in its list
            }
            else{
                temp.next=rhead;
                temp=rhead;
                rhead=rhead.next;
            }
            
        }
        if(lhead!=null){//join the temp to the remaining ll
            temp.next=lhead;
           
        }else{
            temp.next=rhead;
            
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
        ll.AddFirst(5);
        ll.AddFirst(4);
        
        ll.print();
        head=merge_sort(head);
        ll.print();

    }
    

}
