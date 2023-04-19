public interface MyLinkList<E> {
    // Add a new element at the end of this list
    void add(E e);

    // Add a new element at the specified index in this list
    void add(int index, E e);

    // Return the number of elements in this list
    int size();
    // Clear the list
    void clear();

    // Return true if this list contains the element
    boolean contains(E e);

    // Return the element from this list at the specified index
    E get(int index);
    /** Return the index of the first matching element in this list.
     *  Return -1 if no match. */
    public int indexOf(E e);

    // Return true if this list doesn't contain any elements
    public boolean isEmpty();

    /** Return the index of the last matching element in this list
     * Return -1 if no match. */
    public int lastIndexOf(E e);

}
