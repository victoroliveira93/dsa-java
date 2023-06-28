package datastructure.linkedlist;

public class Node {
    private int value;
    private Node next;

    Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
    public Node getNext() {
        return this.next;
    }
}