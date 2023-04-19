public class MyLinkedList<E> implements MyLinkList<E>{
    private Node<E> head, tail; // Head and Tail of the linked list
    private int size; // Size of the linked list

    // Node class to represent each element of the linked list
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
         // Returns the element stored in this node.
        public E getElement() {
            return element;
        }
         //Returns the reference to the next node in the linked list.
        public Node<E> getNext() {
            return next;
        }
         // Sets the reference to the next node in the linked list.
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    // Constructs an empty linked list.
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Adds a new element at the end of this list.
    public void add(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    // Adds a new element at the specified index in this list.
    public void add(int index, E e) {
        checkIndexForAdd(index);
        if (index == size) {
            add(e);
            return;
        }
        Node<E> newNode = new Node<>(e, null);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    // The method is used to check the index of an element before adding it to the collection
    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {// If the index is less than zero or greater than the current size of the collection,
            throw new IndexOutOfBoundsException();// then an IndexOutOfBoundsException is thrown.
        }
    }

    // Returns the number of elements in this list.
    public int size() {
        return size;
    }

    // Removes all of the elements from this list.
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Returns true if this list contains the specified element.
    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.getElement().equals(e)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public E get(int index) {
        return null;
    }

    public int indexOf(E e) {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public int lastIndexOf(E e) {
        return 0;
    }

    public boolean remove(E e) {
        return false;
    }

    public E remove(int index) {
        return null;
    }

    public Object set(int index, E e) {
        return null;
    }
}
