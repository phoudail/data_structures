package tutorials;

import java.util.Arrays;

public class StackArray<T> implements Stack<T> {

    private Box<T>[] array;
    private int top;

    public StackArray() {
        array = new Box[10];
        top = -1;
    }

    public void push(T item) {
        top++;
        if(top >= array.length) {
            array = Arrays.copyOf(array, array.length + 1);
        }
        array[top] = new Box<T>(item);
    }

    public void pop() {
        array[top] = null;
        top--;
    }

    public T peek() {
        return array[top].value;
    }

    public int size() {
        return top + 1;
    }

}

class Box<T> {
    T value;
    public Box(T value) { this.value = value; }
}