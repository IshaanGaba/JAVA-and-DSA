package Stack;

public class intro_linkedlist {
    public static class Node{
        int data;
        Node next;       
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;//head=top
    public static class Stack1{
        public void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void pop(){
            if(head==null){
                return;
            }
            head=head.next;
        }
        public int peek(){
            return head.data;
        }
        public boolean empty(){
            if(head==null){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack1 s=new Stack1();
        System.out.println(s.empty());
        s.push(5);
        s.push(3);
        s.push(4);
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
