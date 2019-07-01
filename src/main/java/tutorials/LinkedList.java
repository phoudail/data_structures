package tutorials;


public class LinkedList<T> implements List<T> {
    
    private LinkedNode<T> first;
    private int size = 0;


    public LinkedList() {
        first = null;
        size = 0;
    }


    public void add(T item) {
        LinkedNode<T> toAdd = new LinkedNode<T>(item);
        if (first == null) {
            first = toAdd;
        } else {
            LinkedNode<T> cursor = first;
            while(cursor.next != null) {
                cursor = cursor.next;
            }
            cursor.next = toAdd;
        }
        size++;
    }


    public void remove(T item) {
        if(first != null && !first.value.equals(item)) {
            LinkedNode<T> cursor = first;
            LinkedNode<T> previous = cursor;
            cursor = cursor.next;
            while(cursor != null && !cursor.value.equals(item)) {
                previous = cursor;
                cursor = cursor.next;
            }
            if(cursor != null) {
                previous.next = cursor.next;
                size--;
            }  
        } else if(first != null && first.value.equals(item)) {
            first = first.next;
            size--;
        }
    }


    public void removeAll(T item) {
        while(this.contains(item)) {
            this.remove(item);
        }
    }


    public T get (int index) {
        if(index > size-1 || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : " + size + ").");
        }
        int counter = 0;
        LinkedNode<T> cursor = first;
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
        LinkedNode<T> cursor = first;
        while(counter != index) {
            counter++;
            cursor = cursor.next;
        }
        cursor.value = item;
    }

    
    public int indexOf(T item) {
        int index = 0;
        LinkedNode<T> cursor = first;
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

class LinkedNode<T> {

    T value;

    LinkedNode<T> next;

    public LinkedNode(T value) { this.value = value; this.next = null; }

    public LinkedNode(T value, LinkedNode<T> next) { this.value = value; this.next = next; }

}