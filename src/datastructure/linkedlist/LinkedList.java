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

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.getValue());
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.getValue());
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        Node currentNode = this.head;

        while(currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public Node append(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }


        this.length++;

        return newNode;
    }

    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

}

