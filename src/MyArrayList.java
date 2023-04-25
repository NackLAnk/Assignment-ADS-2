import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    // instance variables
    private Object[] arr; // array to hold the elements
    private int size; // number of elements in the list

    // Constructor for creating a new MyArrayList object
    public MyArrayList() {
        this.arr = new Object[5]; // Initialize the array with a default capacity of 5
        this.size = 0; // set the size to 0
    }
    // Adds the specified element to the end of the list
    public void add(T e) {
        if (size == arr.length) { // If the array is full, increase its capacity
            increaseBuffer(); // increase its capacity
        }
        arr[size++] = e; // increment the size
    }

    // Inserts the specified element at the specified position in the list
    public void add( T e, int index) {
        if (size == arr.length) { // If the array is full, increase its capacity
            increaseBuffer();
        }
        for (int i = size - 1; i >= index; i--) { // shift the elements after the insertion point to the right
            arr[i + 1] = arr[i];
        }
        arr[index] = e; // Insert the element at the specified index
        size++; // increment the size
    }
    // Increases the capacity of the internal array to accommodate more elements.
    private void increaseBuffer() {
        Object[] newArr = new Object[arr.length * 2]; // Create a new array with double the capacity of the old array
        // Copy the elements from the old array to the new array using System.arraycopy
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        // Replace the old array with the new array
        arr = newArr;
    }
    // Removes all elements from the list
    public void clear() {
        this.arr = new Object[5]; // Create a new array with the default capacity of 5
        this.size = 0; // Reset the size of the list to 0
    }
    // Returns true if the list contains the specified element, false otherwise
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) { // Iterate over all elements in the list
            if (arr[i].equals(e)) { // If the current element is equal to the specified element
                return true; // return true
            }
        }
        return false;
    }
    // Returns the element at the specified position in the list
    public T get(int index) {
        checkIndex(index); // Check that the index is valid
        return (T) arr[index]; // Cast the element to the appropriate type and return it
    }
    // Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found
    private void checkIndex(int index) {
        if (index < 0 || index >= size) { // The method checks if the given index is within the valid range of indices for the list. If the index is invalid,
            throw new IndexOutOfBoundsException(); // the method throws an IndexOutOfBoundsException with an appropriate error message.
        }
    }

    public int indexOf(T e) {
        for (int i = 0; i < size; i++) { // Iterate over all elements in the list
            if (arr[i].equals(e)) { // If the current element is equal to the specified element, return its index
                return i;
            }
        }
        return -1;
    }
    // get the index of the last occurrence of an element in the list
    public int lastIndexOf(T e) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(e)) { // use equals() to compare the elements
                return i;
            }
        }
        return -1;
    }
    // remove the first occurrence of an element from the list
    public boolean remove(T e) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(e)) { // use equals() to compare the elements
                remove(i); // remove the element at the specified index
                return true;
            }
        }
        return false;
    }

    public T remove(int index) {
        checkIndex(index);  // check if the index is valid
        T removed = (T) arr[index]; // cast the element to the generic type and store it for later return
        for (int i = index; i < size - 1; i++) { // shift elements to remove
            arr[i] = arr[i + 1];
        }
        size--;
        return removed;
    }
    // method returns the number of elements
    public int size() {
        return size; //  It simply returns the value of the size instance variable.
    }
    // method sorts the elements of the MyArrayList instance in ascending order.
    public void sort() {
        Arrays.sort(arr, 0, size); //  sorts the elements of the MyArrayList instance in ascending order.
    }
    public void dublicateDeleater() {
        //Object[] Darr = new Object[arr.length];

        for(int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr.length;j++) {
                if (i == j) {
                    remove(i);
                    return;
                }
            }
        }
        System.err.println("err");;
    }
}