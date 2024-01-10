package Stack;
//solution checked on leetcode
import java.util.Arrays;

public class pal_lll {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public int size() {
        Node temp=head;
        int c=0;
        while (temp!=null) {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        int size=size(head);
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            s.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr;
        if(size%2==0){
            curr=slow;
        }else{
            curr=slow.next;
        }
        while(!s.isEmpty() && curr!=null){
            int x=s.pop();
            if(x!=curr.val){
                return false;
            }   
            curr=curr.next;
        }
        if(s.isEmpty() && curr==null){
            return true;
        }
        return false;

    }    
    /////////OR***///////////////////////OR///////////////////OR////////

    
    public boolean isPalindrome(Node head) {
        Stack<Integer> s=new Stack<>();
        Node slow=head;
        while(slow!=null){
            s.push(slow.val);
            slow=slow.next;
        }
        boolean pal=true;
        while(head!=null){
            int x=s.pop();
            if(x!=head.val){
                pal=false;
                break;
            }
            head=head.next;
        }
        return pal;

    }
    public static void main(String[] args) {
        pal_lll l=new pal_lll();
        l.addLast(2);
        l.addLast(2);
        System.out.println(l.size());
    }
}
