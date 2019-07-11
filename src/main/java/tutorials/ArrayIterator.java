package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private int index;
    private T[] array;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        index++;
        return index < array.length;
    }

    @Override
    public T next() {
        if(index >= 0 && index < array.length) {
            return array[index];
        }
        throw new InvalidDnDOperationException();
    }

}