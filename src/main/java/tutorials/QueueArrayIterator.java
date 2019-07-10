package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class QueueArrayIterator<T> implements Iterator<T> {

    private Box<T>[] array;
    private boolean starting;
    private int index;

    public QueueArrayIterator(QueueArray<T> queue) {
        this.array = queue.getArray();
        this.starting = true;
    }

    @Override
    public boolean hasNext() {
        index++;
        return index < array.length;
    }

    @Override
    public T next() {
        if(index < array.length && index >= 0 && array[index] != null) {
            return array[index].value;
        }
        throw new InvalidDnDOperationException();
    }

}