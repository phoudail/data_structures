package tutorials;

import java.util.Arrays;

public class QueueArray<T> implements Queue<T> {

    private Box<T>[] array;
    int last;
    
    public QueueArray() {
        array = new Box[10];
        last = -1;
    }

    public void add(T item) {
        last++;
        if(last >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[last] = new Box<T>(item);
    }

    public void remove() {
        if(last != -1) {
            for(int i = 0; i < last; i++) {
                array[i] = array[i+1];
            }
            array[last] = null;
            last--;
        }
    }

    public T peek() {
        if(array[0] != null) { return array[0].value; }
        return null;
    }

    public int size() {
        return last + 1;
    }

}
