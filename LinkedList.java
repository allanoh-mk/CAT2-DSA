// Node class to represent elements in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class with basic operations
public class LinkedList {
    Node head; // Points to the first node

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // New node points to current head
        head = newNode; // Update head to the new node
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // List is empty; new node becomes head
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // Traverse to last node
        }
        current.next = newNode; // Add new node at end
    }

    // Delete from the beginning
    public void deleteFromBeginning() {
        if (head == null) return; // List is empty
        head = head.next; // Move head to the next node
    }
}