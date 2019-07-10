package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class StackNodeIterator<T> implements Iterator<T> {

    private StackNode<T> stack;
    private Node<T> cursor;
    private boolean starting;

    public StackNodeIterator(StackNode<T> stack) {
        this.stack = stack;
        this.starting = true;
    }

    @Override
    public boolean hasNext() {
        if(starting) {
            cursor = stack.getLast();
            starting = false;
            return cursor != null;
        }
        cursor = cursor.next;
        return cursor != null;
    }

    @Override
    public T next() {
        if(cursor != null) {
            return cursor.value;
        }
        throw new InvalidDnDOperationException();
    }
    
}