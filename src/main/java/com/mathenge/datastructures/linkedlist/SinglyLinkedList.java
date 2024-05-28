package com.mathenge.datastructures.linkedlist;

public class SinglyLinkedList {

    /**
     * Head refer to the front of the list
     */
    private Node head;

    /**
     * Head refer to the back of the list
     */
    private Node tail;

    /**
     * Size of SinglyLinkedList
     */
    private int size;

    /**
     * Init SinglyLinkedList
     */
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Returns the size of the linked list.
     *
     * @return the size of the list.
     */
    public int size() {
        return size;
    }

    /**
    *Insert first node to the first position
     */
    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null) {
            tail = head;
        }
        size+=1;
    }

    /**
     * Insert at the Last Index
     */
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    /**
     * Insert at nth Index
     */
    public void insertAtIndex(int index, int value) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        //Get Node at index-1
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value, temp.next);
        temp.next = newNode;

        size++;
    }

    /**
     * Delete first item
     */
    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    /**
     * Delete last item
     */
    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;

        return value;
    }

    /**
     * Delete item at index
     */
    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.value;

        prev.next = prev.next.next;

        return value;
    }

    /**
     * Find Node by value
     */
    public Node getByValue(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Get Node at specific index
     */
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    /**
     * Print LinkedList
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    /**
     * This class is the nodes of the SinglyLinked List. They consist of a value and
     * a pointer to the node after them.
     */
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    /**
     * Driver Code
     */
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(25);
        list.insertFirst(34);
        list.insertLast(28);
        list.insertLast(50);

        list.printList();
        System.out.println(list.deleteAtIndex(2));
        list.printList();
    }

}
