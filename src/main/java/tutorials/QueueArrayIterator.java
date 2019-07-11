package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class QueueArrayIterator<T> implements Iterator<T> {

    private Box<T>[] array;
    private int index;

    public QueueArrayIterator(QueueArray<T> queue) {
        this.array = queue.getArray();
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        index++;
        return index < array.length;
    }

    @Override
    public T next() {
        if(index < array.length && index >= 0) {
            if(array[index] == null) {
                return null;
            } else {
                return array[index].value;
            }
        }
        throw new InvalidDnDOperationException();
    }

}