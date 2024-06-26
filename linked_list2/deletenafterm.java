package linked_list2;

import org.w3c.dom.Node;

public class deletenafterm {
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

    public static void del(Node head, int n, int m) {
        Node current = head;
    
    while (current != null) {
        // Skip M nodes
        for (int i = 1; i < M && current != null; i++) {
            current = current.next;
        }
        //reach till mth node
        // If we reached the end, break
        if (current == null) {
            break;
        }

        // Start deleting N nodes
        Node temp = current.next;
        for (int j = 0; j < N && temp != null; j++) {
            temp = temp.next;
        }

        // Link the M-th node to the (M+N+1)-th node
        current.next = temp;
        
        // Move current to the next node to continue the process
        current = temp;
    }
        }
    }

    public static void main(String[] args) {
        deletenafterm l = new deletenafterm();
        l.AddFirst(10);
        l.AddFirst(9);
        l.AddFirst(8);
        l.AddFirst(7);
        l.AddFirst(6);
        l.AddFirst(5);
        l.AddFirst(4);
        l.AddFirst(3);
        l.AddFirst(2);
        l.AddFirst(1);
        l.print();
        del(head, 3, 2);
        l.print();
    }
}
