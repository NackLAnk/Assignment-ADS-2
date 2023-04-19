import java.util.Arrays;

import static com.sun.tools.javac.util.ArrayUtils.ensureCapacity;

public class MyArrayList<T> implements MyList<T> {
    private Object[] arr;
    private int size;

    public MyArrayList() {
        this.arr = new Object[5];
        this.size = 0;
    }

    @Override
    public void add(T e) {

    }

    @Override
    public void add( T e, int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T e) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T e) {
        return 0;
    }

    @Override
    public int lastIndexOf(T e) {
        return 0;
    }

    @Override
    public boolean remove(T e) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void sort() {

    }
}