package Queue;


public class intro_ll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;//front
    public static Node tail;//rear
    public  boolean isempty(){
        return head==null;
    }
    public  void add1(int data){
        Node newNode=new Node(data);
        if(isempty()){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public  int remove1(){
        if(isempty()){
            
            return -1;
        }
        int front=head.data;
        if(head.next==null){
            
            head=tail=null;
            return front;
        }
        head=head.next;
        return front;
    }
    public  int peek1(){
        if(isempty()){
            
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        intro_ll n=new intro_ll();
        n.add1(1);
        n.add1(2);
        n.add1(3);
        n.add1(4);
        System.out.println(n.remove1());
        System.out.println();
        n.add1(5);
        while(!n.isempty()){
            System.out.println(n.peek1());
            n.remove1();
        }
        
    }
}
