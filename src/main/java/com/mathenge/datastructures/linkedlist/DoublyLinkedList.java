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

    /**
     * Insert at nth Index
     */
    public void insertAtIndex(int index, int value) {
        if (index == 0) {
            insertHead(value);
        }

        if (index == size) {
            insertTail(value);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value);
        temp.next.prev = newNode;
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

        size++;
    }

    /**
     * Delete first item (head)
     */
    public void deleteHead() {
        if (head == null) {
            System.out.println("head is null");
            return;
        }
        head = head.next;
        head.next.prev = null;
        size--;
    }

    /**
     * Delete last item (tail)
     */
    public void deleteTail() {
        if (tail == null) {
            System.out.println("tail is null");
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    /**
     * Delete item at index
     */
    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteHead();
        }
        if (index == size - 1) {
            deleteTail();
        }

        //Get item at index
        Node temp = head;
        for(int i = 0; i < index; i++) {
            System.out.println("Value at i: " + i + " is: " + temp.value);
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }

    /**
     * Print Reverse LinkedList
     */
    public void printReverse() {
        if (tail == null) {
            System.out.println("Nothing to reverse");
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.print("END");
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
        list.insertTail(10);
        list.insertAtIndex(3, 90);

        list.printList();
        //list.printReverse();
        //list.deleteHead();
        //list.deleteTail();

        list.deleteAtIndex(2);
        list.printList();
    }
}
