# Assignment-ADS-2

## [![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%2336BCF7&lines=MyArrayList)](https://git.io/typing-svg)

### About MyArrayList

* MyArrayList is a generic class that implements the MyList interface. It represents a dynamic array that can store any type of objects. It provides methods to add, remove, get, and manipulate elements in the list. The class also supports sorting of elements in ascending order.

### Usage

``` java
MyArrayList<Integer> myList = new MyArrayList<>();

myList.add(1);
myList.add(2);
myList.add(3);

System.out.println(myList.get(1)); // prints 2
myList.remove(0);

System.out.println(myList.size()); // prints 2
myList.sort();
```

### Methods

1. `add(T e)`: adds an element to the end of the list. If the array is full, it increases its capacity.
2. `add(T e, int index)`: inserts an element at the specified index in the list. If the array is full, it increases its capacity. It shifts the elements after the insertion point to the right.
3. `clear()`: removes all elements from the list by creating a new array with the default capacity and resetting the size of the list to 0.
4. `contains(T e)`: returns true if the list contains the specified element, false otherwise.
5. `get(int index)`: returns the element at the specified position in the list.
6. `indexOf(T e)`: returns the index of the first occurrence of the specified element in the list or -1 if the element is not found.
7. `lastIndexOf(T e)`: returns the index of the last occurrence of the specified element in the list or -1 if the element is not found.
8. `remove(T e)`: removes the first occurrence of the specified element from the list. If the element is removed, it returns true; otherwise, it returns false.
9. `remove(int index)`: removes the element at the specified index from the list. It shifts the elements after the removal point to the left. It returns the removed element.
10. `size()`: returns the number of elements in the list.
11. `sort()`: sorts the elements of the MyArrayList instance in ascending order using the built-in Arrays.sort() method.
12. `dublicateDeleater()`: a method that is not defined, but it seems to have a typo in its name; it should be duplicateDeleter() instead of dublicateDeleater().

## [![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%2336BCF7&lines=MyLinkedList)](https://git.io/typing-svg)

### About MyLinkedList

* The class has a private nested static class `Node` that represents each element of the linked list. The `Node` class has two instance variables, `element` that stores the element of the node, and `next` that stores a reference to the next node in the linked list. 
* The `MyLinkedList` class has three instance variables: `head`, which stores the reference to the first node of the linked list, `tail`, which stores the reference to the last node of the linked list, and `size`, which stores the number of elements in the linked list.

### Usage

``` java
MyLinkedList<String> list = new MyLinkedList<>();

// Adding elements to the linked list
list.add("apple");
list.add("banana");
list.add("cherry");

// Getting the size of the linked list
System.out.println("Size of the list: " + list.size()); // Output: Size of the list: 3

// Checking if the linked list contains an element
System.out.println("Contains banana? " + list.contains("banana")); // Output: Contains banana? true

// Getting the element at a specific index
System.out.println("Element at index 1: " + list.get(1)); // Output: Element at index 1: banana

// Removing an element from the linked list
list.remove("cherry");
System.out.println("Size of the list after removing cherry: " + list.size()); // Output: Size of the list after removing cherry: 2

// Adding an element at a specific index
list.add(1, "orange");
System.out.println("Element at index 1 after adding orange: " + list.get(1)); // Output: Element at index 1 after adding orange: orange

// Removing all elements from the linked list
list.clear();
System.out.println("Size of the list after clearing: " + list.size()); // Output: Size of the list after clearing: 0
```

### Methods

1. `add(E e)`: This method adds a new element at the end of the linked list.
2. `add(int index, E e)`: This method adds a new element at the specified index in the linked list.
3. `size()`: This method returns the number of elements in the linked list.
4. `clear()`: This method removes all of the elements from the linked list.
5. `contains(E e)`: This method returns true if the linked list contains the specified element.
6. `get(int index)`: This method returns the element at the specified index in the linked list.
7. `indexOf(E e)`: This method returns the index of the first occurrence of the specified element in the linked list, or -1 if the linked list does not contain the 8. element.
9. `isEmpty()`: This method returns true if the linked list contains no elements.
10. `lastIndexOf(E e)`: This method returns the index of the last occurrence of the specified element in the linked list, or -1 if the linked list does not contain the element.
11. `remove(E e)`: This method removes the first occurrence of the specified element from the linked list, if it is present.
12. `remove(int index)`: This method removes the element at the specified position in the linked list.
