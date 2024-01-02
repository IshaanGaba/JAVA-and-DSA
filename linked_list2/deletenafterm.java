package linked_list2;

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
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {

            int i = 1;
            while (i < n) {
                temp = temp.next;
                if (temp.next == null) {
                    break;
                }
                i++;
            }
            Node left = temp;
            if (temp.next == null) {
                break;
            }
            i = 0;
            while (i < m) {
                temp = temp.next;
                if (temp.next == null) {
                    break;
                }
                i++;
            }
            i = 1;
            Node last = temp;
            left.next = last.next;
            last.next = null;
            temp = left.next;
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
