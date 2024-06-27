public class oddeven {
    //we can use an arraylist also to store all values and then make a new ll
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
    public static void oel(Node head) {
        // Initialize pointers for odd and even nodes.
        Node odd = head;
        Node even = head.next;
        Node evenS = head.next; // Save the start of even nodes to link later.
    
        // Traverse the list until there are no more even nodes or no more pairs to process.
        while (even != null && even.next != null) {
            odd.next = odd.next.next; // Link current odd node to the next odd node.
            even.next = even.next.next; // Link current even node to the next even node.
            
            odd = odd.next; // Move the odd pointer to the next odd node.
            even = even.next; // Move the even pointer to the next even node.
        }
    
        // Link the last odd node to the start of even nodes.
        odd.next = evenS;
    }
    
    public static void main(String[] args) {
        oddeven ll=new oddeven();
        ll.AddFirst(6);
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();
        ll.oel(head);
        ll.print();
    }
}
