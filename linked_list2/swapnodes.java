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
        if (head == null || head.next == null) {
            return ;
        }

        // Initialize pointers
        Node first = head, second = head, temp = head;
        int size = 0;

        for (int i = 1; i <= y-1; i++) {
            if(i==x){
                first=temp;
            }
            temp = temp.next;
        }
        second = temp;

        int t = first.data;
        first.data = second.data;
        second.data = t;

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
        swap(3,5);
        l.print();
    }
}
