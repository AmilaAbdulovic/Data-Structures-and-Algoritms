package ba.edu.ibu.collections;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Doubly linked list implementation.
 * 
 * Implement the missing method code.
 * Feel free to delete "return null", etc. lines; they're just placeholders.
 *
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class DoublyLinkedList<Item> implements Iterable<Item> {
    private Node2<Item> head;
    private Node2<Item> tail;
    private int size = 0;

    /* Add a new node to the front of the doubly linked list */
    public void addToFront(Item item) {
        Node2<Item> newNode = new Node2<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        //your code
    }

    /* Remove a node from the front of the doubly linked list */
    public void removeFromFront() {

        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        //your code
    }

    /* Add a new node to the end of the doubly linked list */
    public void addToRear(Item item) {
        Node2<Item> newNode = new Node2<>(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        //your code
    }

    /* Remove a node at the end of the doubly linked list */
    public void removeFromRear() {
        if (tail == null) {
            return;
        }
        tail.prev = tail;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
    }


    /* Get a linked list node by index (0-indexed) */
    public Item get(int index) {
        //your code
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        Node2<Item> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;

    }


    /* Return the current size of the doubly linked list */
    public int count() {
        return size;
    }

    /* Return an Iterator Object */
    @Override
    public Iterator<Item> iterator() {
        return new DoublyLinkedListIterator();
    }

    /* Define the Iterator class, and hasNext() and next() methods */
    private class DoublyLinkedListIterator implements Iterator<Item> {
        public Node2<Item> current = head;

        @Override
        public boolean hasNext() {
            return current != null;

        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.data;
            current = current.next;
            return item;
        }
    }

    /* Get head node (for test purposes) */
    public Node2<Item> getHead() {
        return head;
    }

    /* Get tail node (for test purposes) */
    public Node2<Item> getTail() {
        return tail;
    }
}