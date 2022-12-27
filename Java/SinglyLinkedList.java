class Node {
    int val;
    Node next;
    public Node(int value, Node next) {
        this.val = value;
        this.next = next;
    }
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
    public Node() {
        this.val = 0;
        this.next = null;
    }

}
public class SinglyLinkedList {
    Node head;
    public SinglyLinkedList() {
        this.head = new Node();
    }
    public SinglyLinkedList(int val) {
        this.head = new Node(val);
    }
    public int size() {
        Node temp = head;
        int size = 0;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public void add(int val) {
        Node add = new Node(val);
        if (head.next == null) {
            head.next = add;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = add;
        }
    }
    public void add(int index, int value) {
        Node add = new Node(value);
        if (this.size() < index || index < 0) {
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
        if (this.head.next == null) {
            head.next = add;
        }
        else {
            Node temp = this.head;
            int cur = 0;
            while (cur != index-1) {
                temp = temp.next;
                cur++;
            }
            add.next = temp.next;
            temp.next = add;
        }
    }
    public void addFirst(int value) {
        Node add = new Node(value);
        Node temp = head;
        this.head = add;
        this.head.next = temp;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList testing = new SinglyLinkedList(1);
        testing.add(2);
        testing.add(3);
        testing.add(-1, 5);
        testing.addFirst(6);
        testing.printList();
    }
}
