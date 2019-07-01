package tutorials;

public class LinkedListv2<T> implements List<T> {

    private LinkedNodev2<T> first;
    private LinkedNodev2<T> last;
    private int size = 0;

    public LinkedListv2() {
        first = null;
        last = null;
        size = 0;
    }

    public void add(T item) {
        LinkedNodev2<T> toAdd = new LinkedNodev2<T>(item);
        if(first == null) {
            first = toAdd;
            last = toAdd;
        } else {
            toAdd.previous = last;
            last.next = toAdd;
            last = last.next;
        }
        size++;
    }

    public void remove(T item) {
        LinkedNodev2<T> cursor = first;
        while(cursor != null && !cursor.value.equals(item)) {
            cursor = cursor.next;
        }
        if(cursor != null) {
            LinkedNodev2<T> prev = cursor.previous;
            LinkedNodev2<T> nxt = cursor.next;
            if(prev != null) { prev.next = nxt; } else { first = nxt; }
            if(nxt != null) { nxt.previous = prev; } else {last = prev; }
            size--;
        }  
    }

    public void removeAll(T item)  {
        while(this.contains(item)) {
            this.remove(item);
        }
    }

    public T get (int index) {
        if(index > size-1 || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : " + size + ").");
        }
        int counter = 0;
        LinkedNodev2<T> cursor = first;
        while(counter != index) {
            counter++;
            cursor = cursor.next;
        }
        return cursor.value;
    }


    public void set(int index, T item) {
        if(index > size-1 || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : "+ size + ").");
        }
        int counter = 0;
        LinkedNodev2<T> cursor = first;
        while(counter != index) {
            counter++;
            cursor = cursor.next;
        }
        cursor.value = item;
    }

    public int indexOf(T item) {
        int index = 0;
        LinkedNodev2<T> cursor = first;
        while(cursor != null) {
            if(cursor.value.equals(item)) { return index; }
            index++;
            cursor = cursor.next;
        }
        return -1;
    }

    public boolean contains(T item) {
        return this.indexOf(item) != -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

}

class LinkedNodev2<T> {

    T value;

    LinkedNodev2<T> previous;
    LinkedNodev2<T> next;

    public LinkedNodev2(T value) { this.value = value; this.next = null; this.previous = null; }

    public LinkedNodev2(T value, LinkedNodev2<T> previous, LinkedNodev2<T> next) { this.value = value; this.next = next; this.previous = previous; }

}