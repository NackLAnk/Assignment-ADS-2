public interface MyList<T> {
    // Add a new element at the end of this list.
    void add(T e);

    // Add a new element at the specified index in this list.
    void add(int index, T e);

    // Clear the list
    void clear();

    // Return true if this list contains the element.
    boolean contains(T e);

    // Return the element from this list at the specified index.
    T get(int index);

     //Return the index of the first matching element in this list.
     //Return -1 if no match.
    int indexOf(T e);

     //Return the index of the last matching element in this list.
     //Return -1 if no match.
    int lastIndexOf(T e);

     //Remove the first occurrence of the element e from this list.
     //Shift any subsequent elements to the left.
     //Return true if the element is removed.
    boolean remove(T e);

     //Remove the element at the specified position in this list.
     //Shift any subsequent element to the left
     //Return the element that was removed from the list.
    T remove(int index);

    // Return the number of elements in this list.
    int size();

    // sort the
    void sort();
}
