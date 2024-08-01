public class MyLinkedList {
    public class Node {
        int value;
        Node prev;
        Node next;
    }

    Node head = null;
    Node tail = null;
    int length = 0;

    void add(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; // current last element points to next node
            newNode.prev = tail; // new node points to pervious last element
            tail = newNode; // our new last element is the new node
        }
        length++;
    }

    void addFirst(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    void addLast(int newValue) {
        Node newNode = new Node();
        newNode.value = newValue;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    @Override
    public String toString() {
        Node tmp = head; 
        StringBuilder result = new StringBuilder();

        while (tmp != null) {
            result.append(tmp.value).append(" ");
            tmp = tmp.next;
        }
        return result.toString();
    }
}