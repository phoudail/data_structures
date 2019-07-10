package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class QueueIterator<T> implements Iterator<T> {

    private Queue<T> queue;
    private boolean starting;

    public QueueIterator(Queue<T> queue) {
        this.queue = queue;
        this.starting = true;
    }

    @Override
    public boolean hasNext() {
        if(starting) {
            starting = false;
        } else { queue.remove(); }
        return queue.peek() != null;
    }

    @Override
    public T next() {
        T result = queue.peek();
        if(result != null) {
            return result;
        }
        throw new InvalidDnDOperationException();
    }

}