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
    // Return the index of the first matching element in this list.
    //Return -1 if no match. */
    int indexOf(E e);

    // Return true if this list doesn't contain any elements
    boolean isEmpty();

    // Return the index of the last matching element in this list
    // Return -1 if no match.
    int lastIndexOf(E e);

    // Remove the first occurrence of the element e from this list.
    //  Shift any subsequent elements to the left.
    //  Return true if the element is removed.
    boolean remove(E e);

    // Remove the element at the specified postion in this list.
    //  Shift any subsequent element to the left
    //  Return the element that was removed from the list. */
    E remove(int index);

    // Replace the element at the specified position in this list
    // with the specified element and return the old element.
    Object set(int index, E e);


}
