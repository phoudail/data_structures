package tutorials;

public class StackNode<T> implements Stack<T> {

    private Node<T> last;
    private int size;

    public StackNode() { this.last = null; this.size = 0; }

    public void push(T item) {
        Node<T> toAdd = new Node<T>(item, last);
        last = toAdd;
        size++;
    }

    public void pop() {
        last = last.next;
    }

    public T peek() {
        return last.value;
    }

    public int size() {
        return size;
    }

}

class Node<T> {

    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}