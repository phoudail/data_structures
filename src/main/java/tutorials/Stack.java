package tutorials;

public interface Stack<T> {
    
    void push(T item);

    void pop();

    T peek();

    int size();

}