package tutorials;

// Abstract Data Type

public interface List<T> {

    // Preconditions --> a condition that the instance must meet in order for the operation to succeed
    // Postconditions --> a condition reflecting the state of the instance after the operation
    // Invariants --> conditions the instance must meet before and after the operation


    // Postconditions:
    //  this.contains(item)
    //  this.size() == old.size() + 1

    void add(T item);

    // if old.contains(item) {  }
    // Removes the first occurence of item
    void remove(T item);

    void removeAll(T item);

    T get (int index);

    void set(int index, T item);

    // First index in which item appears, otherwise, -1
    int indexOf(T item);

    boolean contains(T item);

    int size();

    boolean isEmpty();
}

