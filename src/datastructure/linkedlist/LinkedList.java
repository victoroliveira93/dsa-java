package datastructure.linkedlist;


public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.getValue());
        }
    }

    public void printTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.getValue());
        }
    }

    public void printLength() {
        System.out.printf("Length: %d", length);
    }

    public void printList() {
        Node currentNode = this.head;

        while(currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

}

