package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class StackIterator<T> implements Iterator<T> {

    private Stack<T> stack;
    private boolean starting;

    public StackIterator(Stack<T> stack) {
        this.stack = stack;
        this.starting = true;
    }

    @Override
    public boolean hasNext() {
        if(starting) {
            starting = false;
        } else { stack.pop(); }
        return stack.peek() != null;
    }

    @Override
    public T next() {
        T result = stack.peek();
        if(result != null) {
            return result;
        }
        throw new InvalidDnDOperationException();
    }
    
}