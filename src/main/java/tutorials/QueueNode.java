package tutorials;


public class QueueNode<T> implements Queue<T> {

    private int size;
    private Node<T> last;
    private Node<T> first;

    public QueueNode() {
        size = 0;
        last = null;
        first = null;
    }

    public void add(T item) {
        Node<T> toAdd = new Node<T>(item);
        if(last != null) {
            last.next = toAdd;
            last = toAdd;
        } else {
            first = toAdd;
            last = toAdd;
        }
        size++;
    }

    public void remove() {
        if(first != null) { 
            if(first == last) {
                last = last.next;
            } 
            first = first.next; size--;
        }
    }

    public T peek() {
        if(first != null) { return first.value; }
        return null;
    }

    public int size() {
        return size;
    }

}

