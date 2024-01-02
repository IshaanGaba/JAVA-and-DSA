// https://leetcode.com/problems/intersection-of-two-linked-lists/solutions/49785/java-solution-without-knowing-the-difference-in-len/ for solution understanding----------
public class intersection_ll {
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
    public static Node intersect(Node headA,Node headB) {
        if(headA==null || headA.next==null){
            return null;
        }
        Node tempA=headA;
        Node tempB=headB;
        while (tempA!=tempB) {
            tempA=tempA.next;
            tempB=tempB.next;
            if(tempA==null){
                tempA=headB;
            }
            if(tempB==null){
                tempB=headA;
            }
        }
        return tempA;
        // while(tempA!=tempB){
        //     tempA=tempA==null?headB:tempA.next;
        //     tempB=tempB==null?headA:tempB.next;
        // }
        // return tempA;
    }
    public static void main(String[] args) {
        intersection_ll list = new intersection_ll();
        Node head1, head2;
        head1 = new Node(4);
        head2 = new Node(1);
        Node newNode = new Node(2);
        head2.next = newNode;
        newNode = new Node(3);
        head2.next.next = newNode;
        newNode = new Node(6);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(7);
        head1.next.next = newNode;
        head1.next.next.next = null;
        System.out.println(intersect(head1, head2).data);
    }
}
