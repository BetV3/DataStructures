import java.util.NoSuchElementException;

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
    int length = 0;
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
            length++;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = add;
            length++;
        }
    }
    public void add(int index, int value) {
        Node add = new Node(value);
        if (this.size() < index || index < 0) {
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
        if (this.head.next == null) {
            head.next = add;
            length++;
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
            length++;
        }
    }
    public void addFirst(int value) {
        Node add = new Node(value);
        // Testing edge case if LinkedList is empty
        if(this.head == null) {
            this.head = add;
            length++;
        }  
        // Adding Node to the head
        Node temp = head;
        this.head = add;
        this.head.next = temp;
    }
    public void addLast(int value) {
        Node add = new Node(value);
        if (this.head == null) {
            this.head = add;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = add;
    }
    public void clear(){
        this.head = null;
    }
    public int get(int index) {
        if (index > this.size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return this.head.val;
        }
        Node temp = this.head;
        int cur = 0;
        while (cur != index) {
            temp = temp.next;
            cur++;
        }
        return temp.val;
    }
    public int getFirst() {
        if (this.size() == 0) {

        }
        return this.head.val;
    }
    public int getLast() {
        if (this.size() == 0) {
            throw new NoSuchElementException();
        }
        if (this.size() == 1) {
            return head.val;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.val;
    }
    public int indexOf(int value) {
        if (this.head.val == value) {
            return 0;

        }
        Node temp = this.head;
        int cur = 0;
        while (temp.next != null) {
            if (temp.val == value) {
                return cur; 
            }
            temp = temp.next;
            cur++;
        }
        return -1;
    }
    public int lastIndexOf(int value) {
        if (this.head.val == value) {
            return 0;
        }
        Node temp = this.head;
        int curr = 0;
        int lastIndex = -1;
        while (temp.next != null) {
            if (temp.val == value) {
                lastIndex = curr;
            }
            temp = temp.next;
            curr++;
        }
        return lastIndex;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(String.valueOf(temp.val) + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList testing = new SinglyLinkedList(1);
        testing.add(2);
        testing.add(2);
        testing.add(1, 5);
        testing.addFirst(6);
        testing.addLast(10);
        System.out.println(testing.lastIndexOf(1));
        testing.printList();
    }
}
