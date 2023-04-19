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
        checkIndex(index);
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getElement();
    }

    // The method is used to check the index of an element before getting it from the collection
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {// If the index is less than zero or greater than or equal to the current size of the collection,
            throw new IndexOutOfBoundsException();// then an IndexOutOfBoundsException is thrown.
        }
    }

     // Returns the index of the first occurrence of the specified element
     // in this list, or -1 if this list does not contain the element.
    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(e)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    //Returns true if this list contains no elements.
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the index of the last occurrence of the specified element
     // in this list, or -1 if this list does not contain the element.
    public int lastIndexOf(E e) {
        Node<E> current = head;
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(e)) {
                lastIndex = i;
            }
            current = current.getNext();
        }
        return lastIndex;
    }

     //Removes the first occurrence of the specified element from this list,
     //if it is present. If the list does not contain the element, it is unchanged.
    public boolean remove(E e) {
        Node<E> current = head;
        Node<E> prev = null;
        while (current != null) {
            if (current.getElement().equals(e)) {
                if (prev == null) {
                    head = current.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                if (current == tail) {
                    tail = prev;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.getNext();
        }
        return false;
    }

     // Removes the element at the specified position in this list.
     // Shifts any subsequent elements to the left (subtracts one from their indices).
    public E remove(int index) {
        checkIndexForRemove(index);
        Node<E> current = head;
        Node<E> prev = null;
        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.getNext();
        }
        if (prev == null) {
            head = current.getNext();
        } else {
            prev.setNext(current.getNext());
        }
        if (current == tail) {
            tail = prev;
        }
        size--;
        return current.getElement();
    }
     //Throws an IndexOutOfBoundsException if the index is out of range for removing an element.
    private void checkIndexForRemove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index for remove operation: " + index);
        }
    }

    public Object set(int index, E e) {
        return null;
    }
}
