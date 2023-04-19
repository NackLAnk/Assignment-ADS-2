public interface MyLinkList<E> {
    // Add a new element at the end of this list
    void add(E e);

    // Add a new element at the specified index in this list
    void add(int index, E e);

    // Return the number of elements in this list
    int size();
}
