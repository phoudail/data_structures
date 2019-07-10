package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class RangeIterator implements Iterator {

    private int start, end, current;

    public RangeIterator(int start, int end) {
        this.start = start;
        this.end = end;
        this.current = start-1;
    }

    @Override
    public boolean hasNext() {
        current++;
        return current <= end;
    }

    @Override
    public Object next() {
        if(current <= end && current >= start) {
            return current;
        }
        throw new InvalidDnDOperationException();
    }
    
}