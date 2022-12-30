class Node {
    int val;
    Node next;
    Node prev;
    public Node(int value, Node next, Node prev) {
        this.val = value;
        this.next = next;
        this.prev = null;
    }
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
    public Node() {
        this.val = 0;
        this.next = null;
        this.prev = null;
    }

}
public class DoubleLinkedList {
    Node head;
    Node tail;
}
