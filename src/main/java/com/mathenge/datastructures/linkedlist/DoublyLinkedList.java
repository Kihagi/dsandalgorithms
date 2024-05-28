package com.mathenge.datastructures.linkedlist;

public class DoublyLinkedList {

    /**
     * Head refer to the front of the list
     */
    private Node head;

    /**
     * Head refer to the back of the list
     */
    private Node tail;

    /**
     * Size of LinkedList
     */
    int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


    /**
     *Insert node to the first position (head)
     */
    public void insertHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    /**
     * Insert at the Last Index (tail)
     */
    public void insertTail(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            insertHead(value);
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        size++;
    }


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("END");
    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertHead(80);
        list.insertHead(60);
        list.insertHead(50);
        list.insertHead(20);

        list.printList();

        list.insertTail(10);

        list.printList();
    }
}
