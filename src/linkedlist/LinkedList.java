package linkedlist;


public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public static void main(String[] args) {

    }

    LinkedList(int value) {
        Node newNode = new Node(value);
    }


}

class Node {
    private int value;
    private Node next;

    Node(int value) {
        this.value = value;
    }
}