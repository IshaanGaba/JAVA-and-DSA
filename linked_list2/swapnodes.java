package linked_list2;

public class swapnodes {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add first
    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void swap(int x,int y) {
        if(head==null || head.next==null){return;}
        Node temp=head;
        int i=1;
        Node prev=null;
        while (i<x) {
            prev=temp;
            temp=temp.next;
            i++;
        }
        Node left=temp;
        Node prev1=null;
        while (i<y) {
            prev1=temp;
            temp=temp.next;
            i++;
        }
        Node right=temp;
        if(right == null || left ==null){
            return;
        }
        if(prev!=null){
            prev.next=right;
        }else{
            head=right;
        }
        if(prev1!=null){
            prev1.next=left;
        }else{
            head=left;
        }
        Node nextl=left.next;
        left.next=right.next;
        right.next=nextl;
    }
    public static void main(String[] args) {
        swapnodes l = new swapnodes();
        // 10->15->12->13->20->14,  x = 3, y = 5
        l.AddFirst(14);
        l.AddFirst(20);
        l.AddFirst(13);
        l.AddFirst(12);
        l.AddFirst(15);
        l.AddFirst(10);
        l.print();
        swap(1, 6);
        l.print();
    }
}
