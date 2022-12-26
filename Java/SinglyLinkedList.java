package Java;

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
        testing.printList();
    }
}
