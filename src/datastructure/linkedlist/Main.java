package datastructure.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);


        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }
}
