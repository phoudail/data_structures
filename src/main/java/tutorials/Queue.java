package tutorials;


public interface Queue<T> {

    void add(T item);

    void remove();

    T peek();

    int size();
}