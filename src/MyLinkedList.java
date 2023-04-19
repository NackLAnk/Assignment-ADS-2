public class MyLinkedList<E> implements MyLinkList<E>{
    private Node<E> head, tail;
    private int size;

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

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
    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return 0;
    }

    public void clear() {

    }

    public boolean contains(E e) {
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
