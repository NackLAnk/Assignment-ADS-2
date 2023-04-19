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

    public void clear() {

    }

    public boolean contains(T e) {
        return false;
    }

    public T get(int index) {
        return null;
    }

    public int indexOf(T e) {
        return 0;
    }

    public int lastIndexOf(T e) {
        return 0;
    }

    public boolean remove(T e) {
        return false;
    }

    public T remove(int index) {
        return null;
    }

    public int size() {
        return 0;
    }

    public void sort() {

    }
}