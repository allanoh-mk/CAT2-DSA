class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head; 
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode; 
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; 
        }
        current.next = newNode; 
    }
    public void deleteFromBeginning() {
        if (head == null) return; 
        head = head.next;
    }
}